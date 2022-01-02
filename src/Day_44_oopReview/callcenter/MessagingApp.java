package Day_44_oopReview.callcenter;

public abstract class MessagingApp {

    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private static int count;
    public static final String APP_TYPE = "Messenger";

    public MessagingApp() {
        System.out.println("MessagingApp no-args constructor...");
    }

    public MessagingApp(String name, int count) {
        this.name = name;
        MessagingApp.count=count;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MessagingApp.count = count;
    }

    abstract void senMessage(String msg);

    public void launch(){
        System.out.println("MessagingApp is launching...");
    }
    public static void close(){
        System.out.println("MessagingApp is closing...");
    }

}


