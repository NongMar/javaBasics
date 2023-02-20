package ClassProject;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}

 interface RemoteWebDriver extends WebDriver{

    void navigate();
        }


class ChromeDriver implements WebDriver {
    @Override
    public void open() {
        System.out.println("Open Chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome browser");
    }

    public String getTitle(){
        String title = " Chrome Title";
        return title;
    }

    public void getScreenshot(){
        System.out.println("Takes screenshot in Chrome");
    }

    public void navigate(){
        System.out.println("navigate Chrome");
    }

}
class FirefoxDriver implements WebDriver {
    @Override
    public void open() {
        System.out.println("Open Firefox browser");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox browser");
    }

    public String getTitle() {
        String title = " Firefox Title";
        return title;
    }

    public void getScreenshot() {
        System.out.println("Takes screenshot in Firefox");
    }

    public void navigate() {
        System.out.println("navigate Firefox");
    }
}

class SafariDriver implements WebDriver {
    @Override
    public void open() {
        System.out.println("Open Safari browser");
    }

    @Override
    public void close() {
        System.out.println("Close Safari browser");
    }

    public String getTitle() {
        String title = " Safari Title";
        return title;
    }

    public void getScreenshot() {
        System.out.println("Takes screenshot in Safari");
    }

    public void navigate() {
        System.out.println("navigate Safari");
    }
}


