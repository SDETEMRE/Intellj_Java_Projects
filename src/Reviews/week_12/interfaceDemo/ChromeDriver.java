package week_12.interfaceDemo;

public class ChromeDriver implements WebDriver{

public ChromeDriver(){
    System.out.println("Launching Chrome Browser");
}


    @Override
    public void get(String url) {
        System.out.println("ChromeDriver -- navigate to " + url);

    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver -- locating element by " + locator);

    }

    @Override
    public void quite() {
        System.out.println("ChromeDriver -- ending all the opened sessions");

    }

    @Override
    public String getTitle() {

        return "ChromeDriver EU7 is the Greatest";
    }
}
