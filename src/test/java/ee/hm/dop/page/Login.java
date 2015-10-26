package ee.hm.dop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import ee.hm.dop.helpers.PageHelper;

public class Login extends Page {

    // Login activities:
    // - expects that Login view has been opened already via header class

    private By taatLoginButton = By.xpath("//a[contains(@data-ng-click, 'taatAuth()')]");
    private By organisationSelectionInTaat = By.id("dropdownlist");
    private By organisationSubmitInTaat = By.xpath("//input[contains(@type, 'submit')]");
    private By userNameInTaat = By.id("username");
    private By passwordInTaat = By.id("password");
    private By loginToTaat = By.xpath("//input[contains(@type, 'submit')]");
    private By rememberTaatLoginCheckbox = By.xpath("//input[contains(@type, 'checkbox')]");
    private By moveBackToKoolikottFromTaat = By.id("yesbutton");

    // mobile login variables
    private By mobileIdCodeField = By.id("idCode");
    private String mobileIDCode = "51001091072";
    private By mobilePhoneNumberField = By.id("phoneNumber");
    private String mobilePhoneNumber = "+37260000007";
    private By mobileLoginConfirmation = By.xpath("//a[contains(@data-ng-click, 'mobileIdAuth()')]");

    // backdoor login address
    // nb if ID is change ALL test data must be migrated to new ID for tests to
    // keep working
    private String backDoorLoginAddress = "https://oxygen.netgroupdigital.com/#/dev/login/38202020234";

    /**
     * 
     * @param username
     *            check values at https://eitja.taat.edu.ee/
     * @param password
     * @return
     */
    public Page loginWithTaat(String username, String password) {

        // goes to TAAT login page
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        return PageHelper.getCurrentPage();
    }

    public Page loginWithMobileID() {
        getDriver().findElement(mobileIdCodeField).sendKeys(mobileIDCode);
        getDriver().findElement(mobilePhoneNumberField).sendKeys(mobilePhoneNumber);
        getDriver().findElement(mobileLoginConfirmation).click();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }

        return PageHelper.getCurrentPage();

    }

    public void loginWithBackDoor() {
        getDriver().get(backDoorLoginAddress);
    }

}
