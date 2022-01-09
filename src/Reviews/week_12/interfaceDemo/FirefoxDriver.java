package week_12.interfaceDemo;

public class FirefoxDriver implements WebDriver{
    public FirefoxDriver(){
        System.out.println("Launching FirefoxDriver Browser");
    }


    @Override
    public void get(String url) {
        System.out.println("FirefoxDriver -- navigate to " + url);

    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver -- locating element by " + locator);

    }

    @Override
    public void quite() {
        System.out.println("FirefoxDriver -- ending all the opened sessions");

    }

    @Override
    public String getTitle() {

        return "FirefoxDriver EU7 is the Greatest";
    }
}

