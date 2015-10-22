package ee.hm.dop.page;

import org.openqa.selenium.By;

public class UserMenu extends Page {

    static By userMenu = By.id("userMenu");
    static By myProfile = By.xpath("//span[contains(@data-translate, 'MY_PROFILE')]");
    static By logOut = By.xpath("//span[contains(@data-translate, 'LOGOUT')]");
    static By loggedInUsersName = By.xpath("//span[contains(@class, 'username')]");

    public void openUserMenu() {
        getDriver().findElement(userMenu).click();
    }

    public boolean userMenuisVisible() {
        if (getDriver().findElement(userMenu).isDisplayed()) {
            return true;
        }
        return false;

    }

    public void myProfile() {
        openUserMenu();
        getDriver().findElement(myProfile).click();
    }

    public void logOut() {
        openUserMenu();
        getDriver().findElement(logOut).click();
    }

    public String getUserName() {
        String userName = getDriver().findElement(loggedInUsersName).getText();
        return userName;
    }

    // advanced search

}
