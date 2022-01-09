package Reviews.week_8_testEnvironment;

public class Tests {
    public static void main(String[] args) {

        TestEnvironment testOne = new TestEnvironment();

      //  testOne.browser = "Chrome"; we cannot do with this way

        testOne.browser = new Browser("Chrome");
        testOne.os = new OS("Windows");

        System.out.println("My test environment for test one is : " + testOne.toString());


        TestEnvironment testTwo = new TestEnvironment();

        testTwo.browser = new Browser();
        testTwo.browser.setBrowserType("Safari");

        testTwo.os = new OS();
        testTwo.os.setOs("MAC");

        System.out.println("My test environment for test two is : " + testTwo.toString());

    }
}
