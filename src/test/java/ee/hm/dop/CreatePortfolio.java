package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

public class CreatePortfolio {

    @Test
    public void createSimplePortfolio() {

        String titleTextOnProfilePage = goToLandingPage() //
                .getHeader() //
                .clickLogin() //
                .loginWithBackDoor("user")//
                .moveCursorToFAB() //
                .moveCursorToAddPortfolio()//
                .clickAddPortfolio() //
                .setPortfolioTitle("Cool Title")//
                .setPortfolioDescription("Cool description") //
                .clickCreatePortfolio() //
                .getHeader() //
                .clickKoolikottLogo() //
                .getHeader() //
                .clickOpenUserMenu() //
                .clickMyProfile() //
                .isCreatedPortfolioTitlePresent();

        Assert.assertEquals("Cool Title", titleTextOnProfilePage);

    }

}
