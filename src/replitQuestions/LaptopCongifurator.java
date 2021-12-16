package replitQuestions;

import java.util.Scanner;

public class LaptopCongifurator {
    public static void main(String[] args) {

        double laptopPrice = 0;

        Scanner scan = new Scanner (System.in);
        System.out.println("Select screen size:");
        double screenSize = scan.nextDouble();
        if(screenSize==13.3){
            laptopPrice+=200;
        }else if (screenSize==15.0){
            laptopPrice+=300;
        }else if(screenSize==17.3){
            laptopPrice+=400;
        }

        System.out.println("Select CPU type:");
        String cpuType= scan.nextLine();
        switch(cpuType){
            case "i3":
                laptopPrice+=150;
                break;
            case "i5":
                laptopPrice+=250;
                break;
            case "i7":
                laptopPrice+=350;
                break;

        }

        String x= scan.nextLine();

        System.out.println("Select RAM size:");
        int ramSize = scan.nextInt();
        if (ramSize==4){
            laptopPrice+=50;
            ///bitmedi
        }
        System.out.println("Select storage type:");
        String storageType = scan.nextLine();

        if(storageType=="SSD"){
            laptopPrice+=100;
        } else if (storageType=="HDD"){
            laptopPrice+=50;
        }
        String x1= scan.nextLine();

        System.out.println("Enter memory size:");
        int memorySize = scan.nextInt();

        if(memorySize==500 && storageType == "SSD"){
            laptopPrice+=100;
        } else if (memorySize==500 && storageType == "HDD"){
            laptopPrice+=50;
        }
        String x2= scan.nextLine();
        System.out.println("Enter screen resolution:");
        String resolution = scan.nextLine();

        if (resolution == "FULLHD"){
            laptopPrice+=100;
        }else if (resolution == "4K")
            laptopPrice+=200;


        System.out.println("Laptop price is: $" + laptopPrice);
    }

}
