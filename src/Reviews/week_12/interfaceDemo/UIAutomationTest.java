package week_12.interfaceDemo;

public class UIAutomationTest {
    public static void main(String[] args) {




        ChromeDriver driver1 = new ChromeDriver();
        FirefoxDriver driver2 = new FirefoxDriver();

        driver1.get("http://practice.cybertekschool.com");
        driver1.findElement("//input[att='value']");
        driver1.getTitle();
        driver1.quite();

        System.out.println("===================================================");

        driver2.get("http://practice.cybertekschool.com");
        driver2.findElement("//input[att='value']");
        driver2.getTitle();
        driver2.quite();
    }
}
