package ee.hm.dop.components;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ee.hm.dop.helpers.PageHelper;
import ee.hm.dop.page.Page;
import ee.hm.dop.page.PortfolioPage;

public class AddPortfolio extends PageComponent {

    private By portfolioTitle = By.id("add-portfolio-title-input");
    private By portfolioDescription = By.id("add-portfolio-description-input");
    private By selectEducationalContext = By.id("taxonEducationalSelect");
    // private By selectEducationalContext = By.xpath("//md-select[contains(@id,
    // 'taxonEducationalSelect')]/..");
    private By higherEducation = By.id("select_option_45");
    private By preschoolEducation = By.id("select_option_43");
    private By basicEducation = By.xpath("//md-option[contains(@data-translate, 'BASICEDUCATION')]");
    private By secondaryEducation = By.id("select_option_5");
    private By vocationalEducation = By.id("select_option_46");
    private By continuingEducation = By.id("select_option_8");
    private By teacherEducation = By.id("select_option_9");
    private By specialEducation = By.id("select_option_10");
    private By otherEducation = By.id("select_option_11");
    private By cancelButton = By.id("add-portfolio-cancel-button");
    private By createButton = By.id("add-portfolio-create-button");
    private By addNewChapter = By.xpath("//button[@data-ng-click='addNewChapter()']");

    public Page clickCancelPortfolioCreation() {
        getDriver().findElement(cancelButton).click();
        return PageHelper.getCurrentPage();
    }

    public PortfolioPage clickCreatePortfolio() {
        getDriver().findElement(createButton).click();
        PageHelper.waitForVisibility(addNewChapter);
        String url = getDriver().getCurrentUrl();
        System.out.println(url);
        String portfolioId = url.split("=")[1];
        AddPortfolio.createdPortfoliosId = portfolioId;
        return new PortfolioPage();
    }

    private static String createdPortfoliosId = "0";

    public static String createdPortfoliosId() {
        return createdPortfoliosId;
    }

    public AddPortfolio setPortfolioTitle(String title) {
        getDriver().findElement(portfolioTitle).clear();
        getDriver().findElement(portfolioTitle).sendKeys(title);
        return this;
    }

    public AddPortfolio setPortfolioDescription(String description) {
        getDriver().findElement(portfolioDescription).clear();
        getDriver().findElement(portfolioDescription).sendKeys(description);
        return this;
    }

    public AddPortfolio selectEducationalContext(String educationalContext) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(selectEducationalContext));

        getDriver().findElement(selectEducationalContext).click();
        PageHelper.waitForVisibility(basicEducation);

        switch (educationalContext) {
            case "Preschool":
                getDriver().findElement(preschoolEducation).click();
                break;

            case "Basic":
                getDriver().findElement(basicEducation).click();
                break;

            case "Secondary":
                getDriver().findElement(secondaryEducation).click();
                break;

            case "Higher":
                getDriver().findElement(higherEducation).click();
                break;

            case "Vocational":
                getDriver().findElement(vocationalEducation).click();
                break;

            case "Continuing":
                getDriver().findElement(continuingEducation).click();
                break;

            case "Teacher":
                getDriver().findElement(teacherEducation).click();
                break;

            case "Special":
                getDriver().findElement(specialEducation).click();
                break;

            case "Other":
                getDriver().findElement(otherEducation).click();
                break;

            default:
                throw new NotImplementedException("Educational context while creating a portfolio not found");

        }

        return this;
    }

}
