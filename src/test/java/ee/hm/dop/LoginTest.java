package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;

import org.junit.Assert;
import org.junit.Test;

import ee.hm.dop.page.LandingPage;

public class LoginTest extends AbstractTest {
    // Tests Mobile login
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
                .clickOpenUserMenu() //
                .clickMyProfile() //
                .getUserName();

        // verify that user was loged in with taat
        Assert.assertEquals("Seitsmes Testnumber", userName);

    }

    // Tests TAAT login
    /*
     * @Test public void loginTaat() throws InterruptedException { // tests TAAT
     * login method. Do not use this for tests that require login // (use
     * backdoor instead - Login.loginWithBackdoor)
     * 
     * // goes to landing page
     * 
     * LandingPage landingPage = (LandingPage) goToLandingPage()//
     * .getHeader()// .clickLogin() // .loginWithTaat("student", "test");
     * 
     * String userName = landingPage.getHeader()// .clickOpenUserMenu()//
     * .clickMyProfile()// .getUserName();
     * 
     * // verify that user was loged in with taat Assert.assertEquals(
     * "Testtäisnimi Testperenimi", userName); }
     */

    @Test
    public void loginEkool() throws InterruptedException {
        // tests Ekool login method. Do not use this for tests that require
        // login
        // (use backdoor instead - Login.loginWithBackdoor)

        LandingPage landingPage = (LandingPage) goToLandingPage()//
                .getHeader()//
                .clickLogin() //
                .clickLoginWithEkool() //
                .loginWithEkool("peeter.paan", "parool") //
                .confirmEkool();

        String userName = landingPage.getHeader()//
                .clickOpenUserMenu()//
                .clickMyProfile()//
                .getUserName();

        // verify that user was loged in with taat
        Assert.assertEquals("Peeter Paan", userName);
    }

}
