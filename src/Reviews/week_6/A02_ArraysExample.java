package Reviews.week_6;

public class A02_ArraysExample {
    public static void main(String[] args) {

        //create an int array which has HTML status codes of :
        // 200,201,204,400,401,403,404 and 500

        int[] statusCodes = {200, 201, 204, 400, 401, 403, 404, 500};

        System.out.println("-----------size of my array--------------");
        System.out.println(statusCodes.length);

        String[] responseTypes = {"OK", "Created", "No Content", "Bad Request",
                "Unauthorized", "Forbidden", "Not Found", "Internal Server Error"};

        // loop through each elements of these arrays you have two options:
        //for loop with index number, the first one "0" index and last one "length-1,
        //second one is for eachloop
        System.out.println("---------------for loop------------------");
        for (int i = 0; i < statusCodes.length; i++) {
            System.out.println(statusCodes[i] + " Status Code : " + responseTypes[i]);
        }
// for each loop: this type loop only can be used with collections and data Structures (like array)
        // Array, ArrayList, List, Map...etc
        //advantages: easier syntax, no need to deal with index
        //disadvantages: you cannot make your loop go backwards
        System.out.println("--------------for each loop----------------");
        int j = 0;
        for (String response : responseTypes) {
            System.out.println(statusCodes[j] + " Status Code : " + response);
           j++;
        }



















        }
    }
