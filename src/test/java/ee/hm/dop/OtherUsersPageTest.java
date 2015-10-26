package ee.hm.dop;

import static ee.hm.dop.page.OtherUsersPage.goToOtherUsersPage;

import org.junit.Assert;
import org.junit.Test;

import ee.hm.dop.page.LandingPage;

public class OtherUsersPageTest {
    // Tests accessibility of other users page with anonymous login
    @Test
    public void otherUsersPage() throws InterruptedException {
        // tests TAAT login method. Do not use this for tests that require login
        // (use backdoor instead - Login.loginWithBackdoor)

        // goes to landing page

        LandingPage.goToLandingPage();
        String schoolName = goToOtherUsersPage("seitsmes.testnumber")//
                .getSchoolName();

        // verify that user was loged in with taat
        Assert.assertEquals("Hugo Treffneri Gümnaasium", schoolName);

    }

}
