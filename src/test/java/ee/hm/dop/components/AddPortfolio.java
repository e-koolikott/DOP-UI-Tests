package ee.hm.dop.components;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.By;

public class AddPortfolio extends PageComponent {

    private By portfolioTitle = By.id("portfolioTitleInput");
    private By portfolioDescription = By.id("portfolioDescriptionTextarea");
    private By createPortfolioButton = By.xpath("//button/span[contains(@data-translate,'BUTTON_CREATE_PORTFOLIO')]");
    private By cancelPortfolioButton = By.xpath("//button/span[contains(@data-translate,'BUTTON_CANCEL')]");
    private By selectEducationalContext = By.id("portfolioEducationalSelect");
    private By higherEducation = By.id("select_option_6");
    private By preschoolEducation = By.id("select_option_3");
    private By basicEducation = By.id("select_option_4");
    private By secondaryEducation = By.id("select_option_5");
    private By vocationalEducation = By.id("select_option_7");
    private By continuingEducation = By.id("select_option_8");
    private By teacherEducation = By.id("select_option_9");
    private By specialEducation = By.id("select_option_10");
    private By otherEducation = By.id("select_option_11");

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
        getDriver().findElement(selectEducationalContext).click();
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
