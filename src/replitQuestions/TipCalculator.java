package replitQuestions;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        double totalToPay=0;
        double totalTip=0;
        double totalPerPerson=0;
        double tipPerPerson=0;

        Scanner scan =new Scanner (System.in);
        System.out.println("Split:");
        String split = scan.next();


        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();


        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();

        System.out.println("Service Quality:");
        String serviceQuality = scan.next();

        if(split.toLowerCase().equals("yes") && serviceQuality.toLowerCase().equals("poor")){
            totalToPay = checkAmount*1.05;
            totalTip = checkAmount*0.05;
            totalPerPerson= (totalToPay/numberOfPeople);
            tipPerPerson= (totalTip/numberOfPeople);

        }else if (split.toLowerCase().equals("yes") && serviceQuality.toLowerCase().equals("fair")){
            totalToPay = checkAmount*1.1;
            totalTip = checkAmount*0.10;
            totalPerPerson= (totalToPay/numberOfPeople);
            tipPerPerson= (totalTip/numberOfPeople);

        }else if (split.toLowerCase().equals("yes")&& serviceQuality.toLowerCase().equals("good")){
            totalToPay = checkAmount*1.15;
            totalTip = checkAmount*0.15;
            totalPerPerson= (totalToPay/numberOfPeople);
            tipPerPerson= (totalTip/numberOfPeople);

        }else if (split.toLowerCase().equals("yes")&& serviceQuality.toLowerCase().equals("great")){
            totalToPay = checkAmount*1.20;
            totalTip = checkAmount*0.20;
            totalPerPerson= (totalToPay/numberOfPeople);
            tipPerPerson= (totalTip/numberOfPeople);

        }else if (split.toLowerCase().equals("yes")&& serviceQuality.toLowerCase().equals("excellent")){
            totalToPay = checkAmount*1.25;
            totalTip = checkAmount*0.25;
            totalPerPerson= (totalToPay/numberOfPeople);
            tipPerPerson= (totalTip/numberOfPeople);


        }

        System.out.print("Number of people entered: ");
        for (int i=0; i<numberOfPeople; i++) {
            System.out.println("&");
        }
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);
    }

    }

