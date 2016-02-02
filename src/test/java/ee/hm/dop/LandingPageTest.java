package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

public class LandingPageTest {

    // testing accessibility of about page from the landing page
    @Test
    public void goToLandingPageWithLogo() {

        // open first page as landing page and click on about link
        // verify opening of about page
        String landingPageTitle = goToLandingPage() //
                .clickAboutLink() //
                .getHeader() //
                .clickKoolikottLogo() //
                .getTitle();

        Assert.assertEquals("Uuemad", landingPageTitle);

    }

}
