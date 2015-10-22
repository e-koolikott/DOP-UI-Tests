package ee.hm.dop.page;

import org.openqa.selenium.By;

public class DetailedSearch extends Page {

    private By detailedSearchMainField = By.id("detailedSearchMainField");
    private By detailedSearchTitleField = By.id("detailedSearchTitleField");
    private By detailedSearchDescriptionField = By.id("detailedSearchDescriptionField");
    private By detailedSearchAuthorField = By.id("detailedSearchAuthorField");
    private By detailedSearchMaterialsField = By.id("detailedSearchMaterialsField");
    private By detailedSearchPortfoliosField = By.id("detailedSearchPortfoliosField");
    private By detailedSearchPaidField = By.id("detailedSearchPaidField");
    private By detailedSearchPrescchoolField = By.id("detailedSearchEducat1");
    private By detailedSearchBasicEducationField = By.id("detailedSearchEducat2");
    private By detailedSearchSecondaryEducationField = By.id("detailedSearchEducat3");
    private By detailedSearchVocationalEducationField = By.id("detailedSearchEducat4");

    public void generalSearch(String searchFor) {
        getDriver().findElement(detailedSearchMainField).clear();
        getDriver().findElement(detailedSearchMainField).sendKeys(searchFor);
    }

    public void titleSearch(String searchFor) {
        getDriver().findElement(detailedSearchTitleField).clear();
        getDriver().findElement(detailedSearchTitleField).sendKeys(searchFor);
    }

    public void descriptionSearch(String searchFor) {
        getDriver().findElement(detailedSearchDescriptionField).clear();
        getDriver().findElement(detailedSearchDescriptionField).sendKeys(searchFor);
    }

    public void authorSearch(String searchFor) {
        getDriver().findElement(detailedSearchAuthorField).clear();
        getDriver().findElement(detailedSearchAuthorField).sendKeys(searchFor);
    }

    public void switchMaterialSearch() {
        getDriver().findElement(detailedSearchMaterialsField).click();
    }

    public void switchPortfolioSearch() {
        getDriver().findElement(detailedSearchPortfoliosField).click();
    }

    public void switchPaidMaterialSearch() {
        getDriver().findElement(detailedSearchPaidField).click();
    }

    public void prescoolEducationSearch() {
        getDriver().findElement(detailedSearchPrescchoolField).click();
    }

    public void basicEducationSearch() {
        getDriver().findElement(detailedSearchBasicEducationField).click();
    }

    public void secondaryEducationSearch() {
        getDriver().findElement(detailedSearchSecondaryEducationField).click();
    }

    public void vocationalEducationSearch() {
        getDriver().findElement(detailedSearchVocationalEducationField).click();
    }

}
