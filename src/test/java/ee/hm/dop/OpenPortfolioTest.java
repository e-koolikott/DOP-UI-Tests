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
                .clickSimpleSearch().searchWithSimpleSearch("automated") //
                .getPortfolioBox(7) // portfolio with id 7
                .openPortfolio() //
                .getPortfolioSummary();

        assertEquals("An intriguing summary.", portfolioSummary);
    }

}
