package Day_33_classObject_Constructor;

public class BankAccount {

    double balance;

    // this constructo sets the starting balance to 0.0
    public BankAccount(){
        balance = 0.0;
    }
    //this constructor sets the tarting balance to the value passes as an argument
    public BankAccount(double startBalance){

        balance= startBalance;
    }
    // this constructor sets the starting balance to the value int the string argument

    public BankAccount(String  str){
        balance = Double.parseDouble(str);
    }
    // deposit method makes a deposit into account
    public void deposit(String str){
        balance = balance + Double.parseDouble(str);

    }

    public double getBalance(){

        return balance;
    }

}
