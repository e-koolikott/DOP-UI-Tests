package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OpenMaterialTest {

    // TESTS that material opens (ID=10)
    @Test
    public void openMaterial() throws InterruptedException {
        // go to the landing page
        // search for "automated test"

        String htmlLink = goToLandingPage() //
                .getHeader() //
                .simpleSearch("automated") //
                .getMaterialBox(10) // this one gets the material box with ID=10
                                    // (Automated test material)
                .openMaterial() //
                .getMaterialLink();

        assertEquals("http://automated.test.ee", htmlLink);
    }

}
