package replitQuestions;

import java.util.Scanner;

public class SMSmessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;
//Given a String message in the following format: Sender:<Mike Smith>. From Number:[202-123-3456].
// Message:{I love programing and problem solving} assign the value of the sender, phoneNumber,
// and messageBody variables and print them.
//
//Sender: Mike Smith
//Phone Number: 202-123-3456
//Message body: I love programing and problem solving
        sender = message.substring(message.indexOf("Sender"),message.indexOf('>')).replace('<',' ');
        System.out.println(sender);
        phoneNumber = message.substring(message.indexOf("Fr"),message.indexOf("]")).replaceAll("From","Phone").replace('[',' ');
        System.out.println(phoneNumber);
        messageBody = message.substring(message.indexOf("Message"),message.indexOf('}')).replaceAll("Message","Message body").replace('{',' ');
        System.out.println(messageBody);




    }
}