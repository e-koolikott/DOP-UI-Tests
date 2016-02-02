package ee.hm.dop.page;

import org.openqa.selenium.By;

public class EkoolLoginPage extends Page {

    private By userNameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[@class='button-submit']");

    public EkoolConfirmationPage loginWithEkool(String username, String password) {

        setUserName(username);
        setPassword(password);
        clickEkoolLogin();
        return new EkoolConfirmationPage();
    }

    private void clickEkoolLogin() {
        getDriver().findElement(loginButton).click();
    }

    private void setPassword(String password) {
        getDriver().findElement(passwordField).clear();
        getDriver().findElement(passwordField).sendKeys(password);
    }

    private void setUserName(String username) {
        getDriver().findElement(userNameField).clear();
        getDriver().findElement(userNameField).sendKeys(username);
    }

}
