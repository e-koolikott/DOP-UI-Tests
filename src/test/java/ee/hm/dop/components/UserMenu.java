package ee.hm.dop.components;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;

import ee.hm.dop.helpers.PageHelper;
import ee.hm.dop.page.LandingPage;
import ee.hm.dop.page.ProfilePage;

public class UserMenu extends PageComponent {

    static By userMenu = By.id("header-user-menu-icon");
    static By myProfile = By.xpath("//span[contains(@data-translate, 'MY_PROFILE')]");
    static By logOut = By.xpath("//span[contains(@data-translate, 'LOGOUT')]");
    static By loggedInUsersName = By.xpath("//span[contains(@class, 'username')]");

    public UserMenu clickOpenUserMenu() {
        if (isOpened()) {
            throw new InvalidElementStateException("User menu is already opened");
        }

        getDriver().findElement(userMenu).click();
        return this;

    }

    public boolean isVisible() {
        if (getDriver().findElement(userMenu).isDisplayed()) {
            return true;
        }
        return false;

    }

    public void myProfile() {
        clickOpenUserMenu();
        getDriver().findElement(myProfile).click();
    }

    public boolean isOpened() {
        if (getDriver().findElement(logOut).isDisplayed()) {
            return true;
        }
        return false;

    }

    public LandingPage clickLogout() {
        getDriver().findElement(logOut).click();
        return new LandingPage();
    }

    public String getUserName() {
        String userName = getDriver().findElement(loggedInUsersName).getText();
        return userName;
    }

    public ProfilePage clickMyProfile() {
        PageHelper.waitForVisibility(myProfile);
        getDriver().findElement(myProfile).click();

        return new ProfilePage();
    }

    // advanced search

}
