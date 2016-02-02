package ee.hm.dop.components;

import org.openqa.selenium.By;

import ee.hm.dop.helpers.PageHelper;
import ee.hm.dop.page.Page;

public class AdvancedSearch extends PageComponent {

    private By advancedSearchIcon = By.id("header-simple-search-toggle-detailed-search-icon");
    private By closeSearch = By.id("header-simple-search-close-icon");

    public SimpleSearch clickCollapseAdvancedSearch() {
        getDriver().findElement(advancedSearchIcon).click();
        return new SimpleSearch();
    }

    public Page clickCloseSearch() {
        getDriver().findElement(closeSearch).click();
        return PageHelper.getCurrentPage();
    }

}
