package WebSite.Tests;

public abstract class BaseTest {
    public void setUp() {
        System.out.println("Запуск теста");
    }

    public void tearDown() {
        System.out.println("Завершение теста");
    }

    public abstract void runTest ();
}
