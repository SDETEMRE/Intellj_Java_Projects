package day_20_stringManipulation_part2;

import java.util.Scanner;

public class Task_82 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String userName = scan.nextLine();
        System.out.print("Enter password: ");
        String password = scan.nextLine();

        String userNameInSystem = "Emre";
        String passwordInSystem = "abc";

        if (userName.equals("") && password.equals("")) {
            System.out.println("UserName and Password Fields cannot be empty");
        } else if (userName.equals("") && !password.equals("")) {
            System.out.println("UserName cannot be empty");
        } else if (!userName.equals("") && password.equals("")) {
            System.out.println("Password cannot be empty");
        } else if (!userName.equals(userNameInSystem) || !password.equals(passwordInSystem)) {
            System.out.println("Username or password not valid,please verify");
        } else if (userName.equals(userNameInSystem) && password.equals(passwordInSystem)) {
            System.out.println("User logged in successfully");
        }
    }
}