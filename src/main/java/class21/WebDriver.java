package class21;

public abstract class WebDriver {

    abstract void openBrowser();
    abstract void loadURL(String url);
    abstract void performTesting();
    abstract void close();


}
class ChromeDriver extends WebDriver{


    @Override
    void openBrowser() {
        System.out.println("opening the google chrome browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the url"+ url);
    }

    @Override
    void performTesting() {
        System.out.println("pro");
    }

    @Override
    void close() {
        System.out.println("Closing the chrome browser");
    }
}
class FireFox extends WebDriver{


    @Override
    void openBrowser() {
        System.out.println("opening the google chrome browser");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the url"+ url);
    }

    @Override
    void performTesting() {
        System.out.println("pro");
    }

    @Override
    void close() {
        System.out.println("Closing the chrome browser");
    }
}