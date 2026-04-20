package WebSite;

public class LoginPage extends BasePage{
    private String username;
    private String password;
    private String url = "ВВВ.логин";
    @Override
    public void checkPageLoaded() {

    }

    @Override
    public void open() {
        System.out.println("Открываем страницу: " + url);
    }

    public void login (String username, String password){
        this.username = username;
        this.password = password;
    }
}
