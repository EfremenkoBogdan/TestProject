package WebSite;

import WebSite.Tests.BaseTest;
import WebSite.Tests.LoginTest;
import WebSite.Tests.ProfileTest;

public class MainWebSite
{
    static void main() {
        LoginTest loginTest = new LoginTest();
        ProfileTest profileTest = new ProfileTest();

        loginTest.setUp();
        loginTest.runTest();
        loginTest.tearDown();

        profileTest.setUp();
        profileTest.runTest();
        profileTest.tearDown();
    }
}
