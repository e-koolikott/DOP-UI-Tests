package ee.hm.dop.components;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import ee.hm.dop.helpers.PageHelper;
import ee.hm.dop.page.EkoolLoginPage;
import ee.hm.dop.page.Page;

public class Login extends PageComponent {

    // Login activities:
    // - expects that Login view has been opened already via header class

    private By taatLoginButton = By.id("login-taat-button");
    private By organisationSelectionInTaat = By.id("dropdownlist");
    private By organisationSubmitInTaat = By.xpath("//input[contains(@type, 'submit')]");
    private By userNameInTaat = By.id("username");
    private By passwordInTaat = By.id("password");
    private By loginToTaat = By.xpath("//input[contains(@type, 'submit')]");
    private By loginToEkool = By.xpath("//button[contains(@data-ng-click, 'ekoolAuth()')]");
    private By rememberTaatLoginCheckbox = By.xpath("//input[contains(@type, 'checkbox')]");
    private By moveBackToKoolikottFromTaat = By.id("yesbutton");
    private By userMenu = By.xpath("//button[contains(@aria-owns, 'menu_container_1')]");

    // mobile login variables
    private By mobileIdCodeField = By.id("login-personal-code");
    private String mobileIDCode = "51001091072";
    private By mobilePhoneNumberField = By.id("login-phone-number");
    private String mobilePhoneNumber = "+37260000007";
    private By mobileLoginConfirmation = By.id("login-mobile-id-button");

    // backdoor login address
    // nb if ID is change ALL test data must be migrated to new ID for tests to
    // keep working
    private String backDoorUserLoginAddress = "https://oxygen.netgroupdigital.com/#/dev/login/38202020234";
    private String backDoorPublisherLoginAddress = "https://oxygen.netgroupdigital.com/#/dev/login/12345678900";
    private String backDoorAdminLoginAddress = "https://oxygen.netgroupdigital.com/#/dev/login/89898989899";

    /**
     * 
     * @param username
     *            check values at https://eitja.taat.edu.ee/
     * @param password
     * @return
     */
    public Page loginWithTaat(String username, String password) {

        // goes to TAAT login page
        PageHelper.waitForVisibility(taatLoginButton);
        getDriver().findElement(taatLoginButton).click();

        // Taat internal processes, to go through the login steps
        Select taatDropdown = new Select(getDriver().findElement(organisationSelectionInTaat));
        taatDropdown.selectByVisibleText("test-idp");
        getDriver().findElement(organisationSubmitInTaat).click();
        getDriver().findElement(userNameInTaat).clear();
        getDriver().findElement(userNameInTaat).sendKeys(username);
        getDriver().findElement(passwordInTaat).clear();
        getDriver().findElement(passwordInTaat).sendKeys(password);
        getDriver().findElement(loginToTaat).click();

        // checks if "Jäta meelde" in TAAT is checked and removes, if it is,
        // removes the check. This is just to keep it consistent for all runs
        // and removing the tick if it has been set is a pain anyways
        if (getDriver().findElement(rememberTaatLoginCheckbox).isSelected()) {
            getDriver().findElement(rememberTaatLoginCheckbox).click();
        }
        getDriver().findElement(moveBackToKoolikottFromTaat).click();

        // waits for redirect to pass, otherwise getCurrentPage will return
        // "/loginRedirect"
        PageHelper.waitForVisibility(userMenu);
        return PageHelper.getCurrentPage();
    }

    public Page loginWithMobileID() {
        getDriver().findElement(mobileIdCodeField).sendKeys(mobileIDCode);
        getDriver().findElement(mobilePhoneNumberField).sendKeys(mobilePhoneNumber);
        getDriver().findElement(mobileLoginConfirmation).click();

        PageHelper.waitForVisibility(userMenu);
        PageHelper.waitForClickable(userMenu);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return PageHelper.getCurrentPage();

    }

    public Page loginWithBackDoor(String userLevel) {
        String backDoorLoginAddress = " ";
        switch (userLevel) {

            case "smallPublisher":
                backDoorLoginAddress = backDoorPublisherLoginAddress;
                break;
            case "admin":
                backDoorLoginAddress = backDoorAdminLoginAddress;
                break;
            case "user":
                backDoorLoginAddress = backDoorUserLoginAddress;
                break;

        }

        getDriver().get(backDoorLoginAddress);
        PageHelper.waitForVisibility(userMenu);
        return PageHelper.getCurrentPage();
    }

    public Page loginWithEkool(String user, String password) {

        PageHelper.waitForVisibility(userMenu);
        return PageHelper.getCurrentPage();
    }

    public EkoolLoginPage clickLoginWithEkool() {
        PageHelper.waitForClickable(loginToEkool);
        getDriver().findElement(loginToEkool).click();
        return new EkoolLoginPage();
    }

}
