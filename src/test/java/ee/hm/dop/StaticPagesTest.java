package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

public class StaticPagesTest extends AbstractTest {

    // testing accessibility of about page from the landing page
    @Test
    public void goToAboutPageFromLandingPage() {

        // open first page as landing page and click on about link
        // verify opening of about page

        String pageTitle = goToLandingPage().clickAboutLink().getMainTitle();

        Assert.assertEquals("Mis on eKoolikott?", pageTitle);

    }

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

    // testing accessibility of static pages on other static pages
    @Test
    public void switchFromHelpToAbout() {

        // open first page as landing page and click on about link
        // verify opening of about page
        String mainTitle = goToLandingPage() //
                .clickHelpLink() //
                .clickAboutLink() //
                .getMainTitle();

        Assert.assertEquals("Mis on eKoolikott?", mainTitle);
    }

    // testing accessibility of static pages on other static pages
    @Test
    public void switchFromAboutToHelp() {

        // open first page as landing page and click on about link
        // verify opening of about page
        String mainTitle = goToLandingPage() //
                .clickAboutLink() //
                .clickHelpLink() //
                .getMainTitle();

        Assert.assertEquals("Kuidas eKoolikotti kasutada?", mainTitle);
    }

}
