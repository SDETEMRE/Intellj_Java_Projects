package Reviews.week_8;

public class Login {
    public static void main(String[] args) {

        Credentials credentials = new Credentials();

//	System.out.println(credentials.userName); Not reachable

//credentials.passWord = "SPARTAAAAAA"; Not reachable

        System.out.println(credentials.getUserName());
        System.out.println(credentials.getPassWord());

        credentials.setPassWord("nebuchadnezzar324");


        System.out.println("After changing : "+ credentials.getPassWord());

    }
}