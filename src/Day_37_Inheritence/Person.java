package Day_37_Inheritence;

public class Person {

        String name;
        int age;
        char gender;
        String code;

        public void eat(String food){
                System.out.println(name + " is eating " + food);
        }
        public void walk(){
                System.out.println(name + " is walking");
        }
        public void sleep(int hours){
                System.out.println(name + " is sleeping for " + hours + " hours");
        }

}
