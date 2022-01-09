package Reviews.week_4;

public class Bank {
    public static void main(String[] args) {

        BankAccount accountOne = new BankAccount();

        accountOne.accountHolderName = "James Bond";
        accountOne.pin=0007;
        accountOne.balance=1_000_000;
        accountOne.accountNumber=1007007007;

        System.out.println(accountOne.getBalance(1111));
        System.out.println(accountOne.getBalance(0007));

        accountOne = new BankAccount();
        System.out.println(accountOne.accountHolderName);

        accountOne.accountHolderName = "Mike Smith";
        accountOne.pin=0007;
        accountOne.balance=1_000_000;
        accountOne.accountNumber=1007007007;

        accountOne =null;
        System.out.println(accountOne);
     //   System.out.println(accountOne.accountNumber);



    }
}
