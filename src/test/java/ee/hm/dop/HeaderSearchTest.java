package ee.hm.dop;

import org.junit.Test;

import ee.hm.dop.page.Header;
import ee.hm.dop.page.Page;

public class HeaderSearchTest {

    @Test
    public void headerSearch() throws InterruptedException {
        Page.goToLandingPage();
        Header header = new Header();
        header.clickLogo();

        String search = "Automated";
        header.clickSearchField(search);
        // header.searchFor(search);

        // TODO: verify header search result

    }

}
