package week_6;

public class A06_FindMax {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "ipad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 179.99, 249.9, 39.99};
        int[] itemIDs = {12345, 123456, 12347, 12348, 12349, 12350};

        // when you try to find MAX or MIN from data Structure,setting an assumption
        // a point to check against

        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>maxPrice){
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }

        }

        System.out.println(items[indexOfMaxPrice]+ "- " + prices[indexOfMaxPrice]+ " Euros - #"+itemIDs[indexOfMaxPrice]);










    }
}
