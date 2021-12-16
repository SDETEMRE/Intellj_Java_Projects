package AssignmentOnArray;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
        System.out.print("enter your character: ");
        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();

        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(select.equals(""+arr[i])){
                flag=true;
                break;
            }

        }if(flag){
            System.out.println(select + " found!");
        }else{
            System.out.println(select + " Not found!");
        }

    }
}
