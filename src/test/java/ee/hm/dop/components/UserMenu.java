package ee.hm.dop.components;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;

import ee.hm.dop.helpers.PageHelper;
import ee.hm.dop.page.Page;

public class UserMenu extends PageComponent {

    static By userMenu = By.id("userMenu");
    static By myProfile = By.xpath("//span[contains(@data-translate, 'MY_PROFILE')]");
    static By logOut = By.xpath("//span[contains(@data-translate, 'LOGOUT')]");
    static By loggedInUsersName = By.xpath("//span[contains(@class, 'username')]");

    public void openUserMenu() {
        if (isOpened()) {
            throw new InvalidElementStateException("User menu is already opened");
        }

        getDriver().findElement(userMenu).click();

    }

    public boolean isVisible() {
        if (getDriver().findElement(userMenu).isDisplayed()) {
            return true;
        }
        return false;

    }

    public void myProfile() {
        openUserMenu();
        getDriver().findElement(myProfile).click();
    }

    public boolean isOpened() {
        if (getDriver().findElement(logOut).isDisplayed()) {
            return true;
        }
        return false;

    }

    public Page clickLogout() {
        getDriver().findElement(logOut).click();
        return PageHelper.getCurrentPage();
    }

    public String getUserName() {
        String userName = getDriver().findElement(loggedInUsersName).getText();
        return userName;
    }

    // advanced search

}
