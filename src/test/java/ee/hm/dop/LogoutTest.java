package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

public class LogoutTest extends AbstractTest {
    // Tests TAAT login
    @Test
    public void logout() throws InterruptedException {
        // tests TAAT login method. Do not use this for tests that require login
        // (use backdoor instead - Login.loginWithBackdoor)

        // goes to landing page

        String userName = goToLandingPage() //
                .getHeader() //
                .clickLogin() //
                .loginWithBackDoor("user") //
                .getHeader() //
                .getUserMenu() //
                .clickOpenUserMenu() //
                .clickLogout() //
                .getTitle();

        // using this assert to verify that we are logged in
        Assert.assertEquals("Ester Tester", userName);

    }

}
