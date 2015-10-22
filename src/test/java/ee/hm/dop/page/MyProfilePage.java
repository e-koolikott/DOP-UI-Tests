package ee.hm.dop.page;

public class MyProfilePage extends Page {
    public static MyProfilePage goToMyProfilePage() {
        getDriver().get("https://oxygen.netgroupdigital.com/");
        return new MyProfilePage();
    }
}
