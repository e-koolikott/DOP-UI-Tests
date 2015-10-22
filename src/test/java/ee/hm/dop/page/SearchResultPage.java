package ee.hm.dop.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultPage extends Page {

    private By actualResults = By.xpath("//div[contains(@id,'results')]/div");

    public List<MaterialBox> getResults() {
        List<WebElement> allMaterials = getDriver().findElements(actualResults);
        List<MaterialBox> searchResults = new ArrayList<>();

        for (WebElement material : allMaterials) {
            searchResults.add(new MaterialBox(material));
        }

        return searchResults;
    }

}
