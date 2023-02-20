package ClassProject;

public class WebDriverTester {

    public static void main(String[] args) {

        WebDriver[] browsers={new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};

        for(WebDriver browser:browsers){
              browser.open();
              browser.getTitle();
              browser.close();
        }

    }
}
