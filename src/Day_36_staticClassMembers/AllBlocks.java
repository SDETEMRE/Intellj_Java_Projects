package Day_36_staticClassMembers;

public class AllBlocks {

    public AllBlocks(int x){
        System.out.println("One Argument Constructor");
    }
    public AllBlocks(){
        System.out.println("No argument constructor");
    }
    static {
        System.out.println("First static int");
    }
    {
        System.out.println("First instance unit");
    }
    {
        System.out.println("Second instance unit");
    }
    static{
        System.out.println("Second static init");
    }
}
