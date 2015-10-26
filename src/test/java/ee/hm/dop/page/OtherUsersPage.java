package ee.hm.dop.page;

import org.openqa.selenium.By;

public class OtherUsersPage extends Page {

    private By schoolName = By.xpath("//p[contains(@data-ng-if, '!myProfile')]");

    public static OtherUsersPage goToOtherUsersPage(String otherUser) {
        getDriver().get("https://oxygen.netgroupdigital.com/#/" + otherUser);
        return new OtherUsersPage();

    }

    public String getSchoolName() {
        return getDriver().findElement(schoolName).getText();
    }

}
