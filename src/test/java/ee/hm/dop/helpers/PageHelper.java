package ee.hm.dop.helpers;

import ee.hm.dop.SeleniumUser;
import ee.hm.dop.page.AboutPage;
import ee.hm.dop.page.HelpPage;
import ee.hm.dop.page.LandingPage;
import ee.hm.dop.page.MyProfilePage;
import ee.hm.dop.page.Page;
import ee.hm.dop.page.SearchResultPage;
import ee.hm.dop.page.UserMenu;

public class PageHelper extends SeleniumUser {
    // page helper method, this contains everything that is not
    // functionality related, all functions for practical usage will be here

    public static LandingPage resetPage() {
        LandingPage landingpage = LandingPage.goToLandingPage();

        UserMenu usermenu = landingpage.getHeader().getUserMenu();
        if (usermenu.userMenuisVisible()) {
            usermenu.logOut();
        }
        return landingpage;

    }

    public static Page getCurrentPage() {

        String url = getDriver().getCurrentUrl();

        String location = url.split("#")[1];
        Page currentPage = null;

        if ("/".equals(location)) {
            currentPage = new LandingPage();
        } else if (location.contains("/search/")) {
            currentPage = new SearchResultPage();
        } else if (location.contains("/testtaisnimi")) {
            currentPage = new MyProfilePage();
        } else if (location.contains("/about")) {
            currentPage = new AboutPage();
        } else if (location.contains("/help")) {
            currentPage = new HelpPage();
        } else {
            throw new RuntimeException("Page not supported, add in PageHelper.getCurrentPage");
        }

        return currentPage;
    }

}
