package WebSite;

public class ProfilePage extends BasePage{
    private String url = "ВВВ.профиль";
    @Override
    public void checkPageLoaded() {

    }

    public void open() {
        System.out.println("Открываем страницу: " + url);
    }

    public void logout () {

    }
}
