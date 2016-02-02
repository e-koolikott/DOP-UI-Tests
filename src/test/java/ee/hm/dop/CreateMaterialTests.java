package ee.hm.dop;

import org.junit.Assert;
import org.junit.Test;

import ee.hm.dop.page.LandingPage;

public class CreateMaterialTests extends AbstractTest {

    @Test
    public void createBasicMaterialAsSmallPublisherFromFab() {

        String creatorName = LandingPage.goToLandingPage() //
                .getHeader() //
                .clickLogin() //
                .loginWithBackDoor("smallPublisher") //
                .clickAddMaterial() //
                .setLink("https://oxygen.netgroupdigital.com/#/smallPublisher") //
                .setTitle("Automated test title") //
                .clickAddMaterial() //
                .getCreatorName();

        Assert.assertEquals("Publisher Publisher", creatorName);

    }

}
