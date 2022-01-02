package Day_34_Constructors;

class Apple {
    String color = "red";
}

class PassingObject {


    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.color);

        changeApple(apple);
        System.out.println(apple.color);
    }

    public static void changeApple(Apple apple) {
        apple.color = "green";
    }
}




