package ee.hm.dop.page;

import org.openqa.selenium.By;

import ee.hm.dop.helpers.PageHelper;

public class EkoolConfirmationPage extends Page {

    private By approveRadio = By.id("approve");
    private By submitButton = By.xpath("//button[@class='button-submit']");
    private By anyMaterialCard = By.xpath("//md-card-content");

    public Page confirmEkool() {
        checkApprove();
        clickSubmitButton();
        PageHelper.waitForClickable(anyMaterialCard);
        return PageHelper.getCurrentPage();
    }

    private void checkApprove() {
        getDriver().findElement(approveRadio).click();
    }

    private void clickSubmitButton() {
        getDriver().findElement(submitButton).click();
    }

}
