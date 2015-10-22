package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

public class AboutPageTest {

    // testing accessibility of about page from the landing page
    @Test
    public void goToAboutPageFromLandingPage() {

        // open first page as landing page and click on about link
        // verify opening of about page
        String mainTitle = goToLandingPage() //
                .clickAboutLink() //
                .getMainTitle();

        Assert.assertEquals("Mis on eKoolikott?", mainTitle);

    }

}
