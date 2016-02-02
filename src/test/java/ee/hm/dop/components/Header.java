package ee.hm.dop.components;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ee.hm.dop.helpers.PageHelper;
import ee.hm.dop.page.LandingPage;
import ee.hm.dop.page.Page;
import ee.hm.dop.page.SearchResultPage;

public class Header extends PageComponent {

    private UserMenu userMenu;
    private By koolikottLogo = By.id("logo");
    private By openSimpleSearch = By.id("header-show-search-button");
    private By simpleSearchInput = By.id("header-simple-search-input");
    private By simpleSearchButton = By.id("header-simple-search-button");
    private By openAdvancedSearch = By.id("header-show-detailed-search-icon");
    private By selectLanguage = By.cssSelector(".form-control.ng-pristine.ng-untouched.ng-valid");
    private By loginButton = By.id("header-login-icon");
    private By detailedSearch = By.id("detailedSearchToggle");
    private By userMenuButton = By.xpath("//button[contains(@aria-owns, 'menu_container_1')]");
    private By linkToMyProfile = By.id("user-menu-view-profile");
    private By closeEditPortfolioView = By.xpath("//button[@ng-click='exitEditPortfolioMode()']");

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
    public SimpleSearch clickSimpleSearch() {
        getDriver().findElement(openSimpleSearch).click();
        return new SimpleSearch();
    }

    // type in search field and execute search
    public SimpleSearch clickAdvancedSearch(String searchFor) {
        getDriver().findElement(openAdvancedSearch).click();
        return new SimpleSearch();
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

    public UserMenu clickOpenUserMenu() {
        PageHelper.waitForClickable(userMenuButton);
        getDriver().findElement(userMenuButton).click();
        return new UserMenu();
    }

    public SearchResultPage searchWithSimpleSearch(String searchFor) {
        getDriver().findElement(openSimpleSearch).click();

        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginButton));

        // getDriver().findElement(openSimpleSearch).click();
        getDriver().findElement(simpleSearchInput).sendKeys(searchFor);
        getDriver().findElement(simpleSearchButton).click();
        return new SearchResultPage();
    }

    public Page clickCloseEditPortfolio() {
        getDriver().findElement(closeEditPortfolioView).click();
        return new LandingPage();
    }

}