package day_24_arrays_part1;

public class Task_90 {
    public static void main(String[] args) {

        String[] cars = {"Honda","Toyota","Nissan","BMW","Mercedes","Porch"};

        boolean flag = false;

        for(int i=0;i<cars.length;i++){
            if(cars[i].equals("Honda")){
                flag=true;
                break;
            }
       }
        if(flag){
            System.out.println("Found it");
        }else{
            System.out.println("Not found it");
        }


    }
}
