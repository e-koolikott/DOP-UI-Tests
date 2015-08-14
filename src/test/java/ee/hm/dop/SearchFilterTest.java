package ee.hm.dop;

import org.junit.Test;

import ee.hm.dop.page.Header;
import ee.hm.dop.page.Page;

public class SearchFilterTest {

    @Test
    public void searchFilter() throws InterruptedException {
        Page.goToLandingPage();

        Header header = new Header();
        String search = "Automated";
        header.clickSearchField(search);
        // header.searchFor(search);

        // verify result count

        // modify subjectr search

        // modify type search

        // modify licence search

    }

}
