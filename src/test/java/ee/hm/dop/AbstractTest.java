package ee.hm.dop;

import org.junit.Before;

import ee.hm.dop.components.UserMenu;
import ee.hm.dop.helpers.PageHelper;

public abstract class AbstractTest {

    @Before
    public void logoutIfLoggedIn() {
        try {
            UserMenu userMenu = PageHelper.getCurrentPage().getHeader().getUserMenu();

            if (userMenu.isVisible()) {
                if (!userMenu.isOpened()) {
                    userMenu.clickOpenUserMenu();
                }

                userMenu.clickLogout();
            }
        } catch (Exception e) {
        }

    }

}
