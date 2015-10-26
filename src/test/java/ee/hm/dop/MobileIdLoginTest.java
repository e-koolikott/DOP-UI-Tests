package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

public class MobileIdLoginTest {
    // Tests TAAT login
    @Test
    public void loginMobileId() throws InterruptedException {
        // tests TAAT login method. Do not use this for tests that require login
        // (use backdoor instead - Login.loginWithBackdoor)

        // goes to landing page

        String userName = goToLandingPage() //
                .getHeader() //
                .clickLogin() //
                .loginWithMobileID() //
                .getHeader() //
                .getUserMenu() //
                .getUserName();

        // verify that user was loged in with taat
        Assert.assertEquals("Seitsmes Testnumber", userName);

    }

}
