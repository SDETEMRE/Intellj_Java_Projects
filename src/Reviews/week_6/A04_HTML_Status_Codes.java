package Reviews.week_6;

import java.util.Scanner;

public class A04_HTML_Status_Codes {
    public static void main(String[] args) {

        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};
        Scanner scan = new Scanner (System.in);
        System.out.println("Tell me the status code you received from the WebPage");
        System.out.println(responseConverter(scan.nextInt()));
    }
    public static String responseConverter(int x) {
        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};
        String [] responses = {"OK", "Created", "no Content", "Bad Request", "Unauthorized", "Forbidden"
                ,"Not Found", "Internal Server Error"};
        for (int i=0 ; i<statusCodes.length ; i++) {
            if (x == statusCodes[i]) {
                return "It's response is: " + responses[i];
            }
        }
        return "invalid status code";





    }

    // write a method called responseConverter (it request)--> return response statement

}
