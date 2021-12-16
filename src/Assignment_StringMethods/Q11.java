package Assignment_StringMethods;

public class Q11 {
    public static void main(String[] args) {

/*
Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}

Declare variables: sender, phoneNumber, messageBody

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programming and problem solving
 */

        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}";
        int a = message.indexOf("<");
        int b = message.indexOf(">");
        int blocks = message.indexOf("[");
        int block = message.indexOf("]");
        int curl1 = message.indexOf("{");
        int curl2 = message.indexOf("}");

        String sender=message.substring(a+1, b);
        String number=message.substring(blocks+1, block);
        String body=message.substring(curl1+1, curl2);

        System.out.println("Sender: "+sender+"\nPhone Number: "+number+"\nMessage Body: "+body);

    }
}
