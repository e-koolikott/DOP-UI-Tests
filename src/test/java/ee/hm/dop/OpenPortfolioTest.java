package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OpenPortfolioTest extends AbstractTest {

    // Tests that portfolio opens (ID=7)
    @Test
    public void openPortfolio() throws InterruptedException {

        String portfolioSummary = goToLandingPage() //
                .getHeader() //
                .simpleSearch("automated") //
                .getPortfolioBox(7) // this one gets the material box with ID=10
                                    // (Automated test material)
                .openPortfolio() //
                .getPortfolioSummary();

        assertEquals("An intriguing summary.", portfolioSummary);
    }

}
