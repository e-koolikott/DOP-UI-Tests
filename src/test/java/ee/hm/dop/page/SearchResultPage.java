package ee.hm.dop.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ee.hm.dop.components.MaterialBox;

public class SearchResultPage extends Page {

    private By actualResults = By.xpath("//div[contains(@id,'results')]/div");

    public List<MaterialBox> getResultsAsMaterialBox() {
        List<WebElement> allMaterials = getDriver().findElements(actualResults);
        List<MaterialBox> searchResults = new ArrayList<>();

        for (WebElement material : allMaterials) {
            searchResults.add(new MaterialBox(material));
        }

        return searchResults;
    }

    public MaterialBox getMaterialBox(int materialId) {
        WebElement materialBoxElement = getDriver().findElement(By.id("materialBox" + materialId));
        return new MaterialBox(materialBoxElement);
    }

    public MaterialBox getPortfolioBox(int portfolioId) {
        WebElement portfolioBoxElement = getDriver().findElement(By.id("portfolioBox" + portfolioId));
        return new MaterialBox(portfolioBoxElement);
    }

}
