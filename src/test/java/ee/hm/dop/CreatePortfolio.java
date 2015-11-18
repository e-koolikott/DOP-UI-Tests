package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Test;

import ee.hm.dop.components.AddPortfolio;

public class CreatePortfolio {

    @Test
    public void createSimplePortfolio() {

        AddPortfolio landingPageTitle = goToLandingPage() //
                .clickAddPortfolio() //
                .setPortfolioTitle("Cool Title")//
                .setPortfolioDescription("Cool description") //
                .selectEducationalContext("Higher");
        // Assert.assertEquals("Uusimad", landingPageTitle);

    }

}
