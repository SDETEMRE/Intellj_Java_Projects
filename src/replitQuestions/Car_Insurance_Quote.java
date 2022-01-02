package replitQuestions;

import java.util.Scanner;

public class Car_Insurance_Quote {

    public static void main(String[] args) {
        //DO NOT CHANGE
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage="";
        int vehicleUsageYears=0;
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        String zipCode="";
        String haveAccident="";
        String haveLicence="";
        int age=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your name");
        name=scan.nextLine();


        System.out.println("Do you have a US driver license?");
        haveLicence=scan.nextLine(); //yes or no
        if(!(haveLicence.equals("Yes")))
        {
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        zipCode=scan.nextLine();
        if(zipCode.equals("20910") || zipCode.equals("20740"))
        {
            premium +=60;
        }
        else if(zipCode.equals("22102") || zipCode.equals("22103"))
        {
            premium +=30;
        }
        else
        {
            premium +=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.nextLine();
        if(vehicleOwnership.equals("Owned"))
        {
            premium +=10;
        }
        else if(vehicleOwnership.equals("Financed") || vehicleOwnership.equals("Leased"))
        {
            premium +=20;
        }

        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.nextLine();
        if(vehicleUsage.equals("Business"))
        {
            premium +=50;
        }
        else if(vehicleUsage.equals("Pleasure"))
        {
            premium +=10;
        }
        else if(vehicleUsage.equals("Commute"))
        {
            premium +=20;

            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool=scan.nextInt();
            premium += daysDrivenToWorkOrSchool * 5;

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool=scan.nextInt();
            premium += milesToWorkOrSchool;
        }

        System.out.println("How old are you?");
        age=scan.nextInt();
        if(age<16)
        {
            System.out.println("Invalid data!");
            System.exit(0);
        }
        else if(age>=16 && age<18)
        {
            premium *= 20;
        }
        else if(age>=18 && age<=21)
        {
            premium *= 6;
        }
        else if(age>21 && age<25)
        {
            premium *= 2;
        }

        System.out.println("How many years you've been driving?");
        vehicleUsageYears=scan.nextInt();
        if(vehicleUsageYears<=0 || ((age - vehicleUsageYears)<16))
        {
            System.out.println(age + "---" + vehicleUsageYears);
            System.out.println("Invalid data!");
            System.exit(0);
        }
        else
        {
            premium -=vehicleUsageYears*5;
        }

        System.out.println("Have you had any accidents in the last 5 years?");
        scan.nextLine();
        haveAccident=scan.nextLine();
        if(haveAccident.toUpperCase().equals("YES"))
        {
            System.out.println("How many?");
            accidentsAmount=scan.nextInt();
            premium += premium*0.2*accidentsAmount;
            scan.nextLine();
        }



        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance=scan.nextLine();
        if(continuousInsurance.equals("No"))
        {
            premium *= 2;
        }

        System.out.println("What is the highest level of education you have completed?");
        education=scan.nextLine();

        if(education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters"))
        {
            premium = premium - (premium * 0.05);
        }
        else if(education.equals("Doctors"))
        {
            premium = premium - (premium * 0.1);
        }
        else if(education.equals("Less than High School"))
        {
            premium = premium + (premium * 0.05);
        }

        referenceNumber = name.toUpperCase().substring(0,2) + age + name.toUpperCase().substring(name.length()-2) + zipCode + education.toUpperCase().replace(" ","");


        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);
        System.out.println("Reference number: "+ referenceNumber);
    }
}
