package ee.hm.dop;

import org.junit.Assert;
import org.junit.Test;

import ee.hm.dop.page.LandingPage;

public class OtherUsersPageTest extends AbstractTest {
    // Tests accessibility of other users page with anonymous login
    @Test
    public void otherUsersPage() throws InterruptedException {
        // tests TAAT login method. Do not use this for tests that require login
        // (use backdoor instead - Login.loginWithBackdoor)

        // goes to landing page

        String userName = LandingPage.goToLandingPage() //
                .goToProfilePage("ester.tester")//
                .getOtherUsersName();

        // verify that user was loged in with taat
        Assert.assertEquals("Ester Tester", userName);

    }

}
