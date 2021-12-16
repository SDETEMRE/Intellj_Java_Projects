package Day_36_staticClassMembers;

public class Dinner {

    static int pizzaSlice = 8;





    public void takeASLice(int count){
        pizzaSlice-=count;

    }


    public void takeASLice() {
        pizzaSlice--;
    }
}
