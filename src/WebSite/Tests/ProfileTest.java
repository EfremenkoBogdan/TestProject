package WebSite.Tests;

import WebSite.ProfilePage;

public class ProfileTest extends BaseTest {
    ProfilePage profilePage = new ProfilePage();


    @Override
    public void runTest() {
        profilePage.open();
        profilePage.checkPageLoaded();
        profilePage.logout();
    }
}
