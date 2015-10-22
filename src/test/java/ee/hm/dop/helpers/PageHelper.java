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

    public Page getCurrentPage() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String url = getDriver().getCurrentUrl();
        String location = url.split("#")[1];
        Page currentLocation = null;

        if ("/".equals(location)) {
            currentLocation = new LandingPage();
        }

        else if (location.contains("/search/")) {
            currentLocation = new SearchResultPage();
        }

        /*
         * else if (location.contains("/material")) { currentLocation = new
         * MaterialPage(); }
         * 
         * else if (location.contains("/portfolio")) { currentLocation = new
         * PortfolioPage(); }
         * 
         * else if (location.contains("/???????????")) { currentLocation = new
         * UserProfilePage(); }
         * 
         * 
         * 
         */
        else if (location.contains("/testtaisnimi")) {
            currentLocation = new MyProfilePage();
        }

        else if (location.contains("/about")) {
            currentLocation = new AboutPage();
        }

        else if (location.contains("/help")) {
            currentLocation = new HelpPage();
        }

        else {
            System.out.println("Undefined page detected - updated PageHelper.getCurrentPage method");
        }

        return currentLocation;
    }

}
