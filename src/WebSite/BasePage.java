package WebSite;

public abstract class BasePage {
    String url;

    public void open() {
        System.out.println("Открываем страницу: " + url);
    }

    public abstract void checkPageLoaded();


}
