package ee.hm.dop.components;

import org.openqa.selenium.By;

import ee.hm.dop.page.SearchResultPage;

public class SimpleSearch extends PageComponent {

    private By advancedSearchIcon = By.id("header-simple-search-toggle-detailed-search-icon");
    private By simpleSearch = By.id("header-simple-search-input");
    private By executeSearch = By.id("header-show-search-button");

    public AdvancedSearch clickAdvancedSearch() {
        getDriver().findElement(advancedSearchIcon).click();
        return new AdvancedSearch();
    }

    // type in search field and execute search
    public SearchResultPage searchWithSimpleSearch(String searchFor) {
        getDriver().findElement(simpleSearch).sendKeys(searchFor);
        getDriver().findElement(executeSearch).click();
        return new SearchResultPage();
    }

}
