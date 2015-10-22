package ee.hm.dop.page;

import ee.hm.dop.SeleniumUser;

public abstract class Page extends SeleniumUser {

    private static final Header header = new Header();
    private static final Footer footer = new Footer();

    public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

}