package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

public class HelpPageTest {

    // testing accessibility of HELP page from the landing page
    @Test
    public void goToHelpPageFromLandingPage() {

        // open first page as landing page and click on about link
        // verify opening of about page
        String mainTitle = goToLandingPage() //
                .clickHelpLink() //
                .getMainTitle();

        Assert.assertEquals("Kuidas eKoolikotti kasutada?", mainTitle);

    }
}