package Day_35_Encapsulation;

public class RoulettePocket {
    /*Write a class named RoulettePocket. The class's constructor should accept
a pocket number. The class should have a method named getPocketColor that
returns the pocket's color, as a string.
Demonstrate the class in a program that asks the user to enter a pocket
number, and displays whether the pocket is green, red, or black. The
program should display an error message if the user enters a number that
is outside the range of 0 and 36.
     */

    private int pocketNumber;

    public RoulettePocket(int pocketNumber) {
        this.pocketNumber = pocketNumber;
    }
    public int getPocketNumber() {
        return pocketNumber;
    }
    public void setPocketNumber(int pocketNumber) {
        if(pocketNumber<0 || pocketNumber>36) {
            this.pocketNumber = 999;
        }else {
            this.pocketNumber = pocketNumber;
        }
    }

    public String getPocketColor() {
        if(pocketNumber==0) {
            return "green";
        }else if(pocketNumber>0 && pocketNumber<11) {
            if(pocketNumber%2==0) {
                return "black";
            }else {
                return "red";
            }
        }else if(pocketNumber>10 && pocketNumber<19) {
            if(pocketNumber%2==0) {
                return "red";
            }else {
                return "black";
            }
        }else if(pocketNumber>18 && pocketNumber<29) {
            if(pocketNumber%2==0) {
                return "red";
            }else {
                return "black";
            }
        }else if(pocketNumber>28 && pocketNumber<37) {
            if(pocketNumber%2==0) {
                return "red";
            }else {
                return "black";
            }
        }else {
            return "invalid";
        }
    }
}