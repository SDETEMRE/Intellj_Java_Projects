package replitQuestions;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num) {

        int fibo1 = 0;
        int fibo2 = 1;
        int flag;

        for(int i = 0; i<=num; i++){
            if(i!=0 && i!=1){

                //0,1,1,2,3,5,8

                flag = fibo2;
                fibo2=fibo1+fibo2;
                fibo1=flag;
            }
        }
        if(num==0 || num==1)
        {
            System.out.println(num);
        } else
        {
            System.out.println(fibo2);
        }

    }
}