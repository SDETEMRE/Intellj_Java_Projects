package Reviews.week_4;

public class AmazonTest2 {
    public static void main(String[] args) {
        System.out.println("--Starting Amazon Search Functional Test--");
        AmazonTest.openBrowser();
        AmazonTest.navigateToAmazonPage();
        AmazonTest.searchForAnItem();
        AmazonTest.verifyResultsAreDisplayed();
        System.out.println("Amazon Search Functional Test Completed - PASS - ");



    }
}
