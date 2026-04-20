package WebSite.Tests;

import WebSite.LoginPage;

public class LoginTest extends BaseTest{
    LoginPage loginPage = new LoginPage();

    @Override
    public void runTest() {
        loginPage.open();
        loginPage.checkPageLoaded();
        loginPage.login("Biba", "qwerty123");
    }
}
