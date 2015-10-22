package ee.hm.dop;

import static ee.hm.dop.page.LandingPage.goToLandingPage;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import ee.hm.dop.page.MaterialBox;

public class SimpleSearchTest {

    @Test
    public void headerSearch() throws InterruptedException {
        // go to the landing page
        // search for "automated test"

        List<MaterialBox> searchResults = goToLandingPage() //
                .getHeader() //
                .simpleSearch("automated") //
                .getResults();

        boolean foundMaterial10 = false;
        for (MaterialBox materialBox : searchResults) {
            if (materialBox.getMaterialId() == 10) {
                foundMaterial10 = true;
                break;
            }
        }

        // verify "automated test" present in search results

        assertTrue(foundMaterial10);
    }

}
