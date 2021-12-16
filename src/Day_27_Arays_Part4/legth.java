package Day_27_Arays_Part4;

public class legth {
    public static void main(String[] args) {

        int [][] numbers = {{1,2,3,4},{5,6},{9,10,11,23,30,50,60}};

        //display the number of rows
        System.out.println("Number of the rows " + numbers.length);
        //display the numbers of columns{ for each row

      //  for(int i=0; i<numbers.length;i++){

        //    System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
            System.out.println("---------------------------------------");

            for(int i1=0; i1< numbers.length;i1++){
                for(int x=0;x<numbers[i1].length;x++){
                    System.out.print(numbers [i1][x]);

                }
                System.out.println();
            }
        }




    }


