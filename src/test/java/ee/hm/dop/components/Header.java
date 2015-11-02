package ee.hm.dop.components;

import org.openqa.selenium.By;

import ee.hm.dop.page.LandingPage;
import ee.hm.dop.page.SearchResultPage;

public class Header extends PageComponent {

    private UserMenu userMenu;
    private By koolikottLogo = By.className("navbar-brand");
    private By simpleSearch = By.xpath("(//input[@type='text'])[2]");
    private By executeSearch = By.id("searchButton");
    private By selectLanguage = By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid");
    private By loginButton = By.id("loginButton");
    private By detailedSearch = By.id("detailedSearchToggle");

    public UserMenu getUserMenu() {
        return userMenu;
    }

    public Header() {
        userMenu = new UserMenu();
    }

    // clicking on logo will move to landingpage
    public LandingPage clickKoolikottLogo() {
        getDriver().findElement(koolikottLogo).click();
        return new LandingPage();
    }

    // type in search field and execute search
    public SearchResultPage simpleSearch(String searchFor) {
        // change to id when added!!!
        getDriver().findElement(simpleSearch).sendKeys(searchFor);
        getDriver().findElement(executeSearch).click();
        return new SearchResultPage();
    }

    // language selection
    public void languageSelection(String setLanguage) {
        getDriver().findElement(selectLanguage).click();
    }

    // user menu
    public Login clickLogin() {
        getDriver().findElement(loginButton).click();
        return new Login();
    }

    // advanced search
    public void detailedSearch() {
        getDriver().findElement(detailedSearch).click();

    }

}