package Day_35_Encapsulation;

public class Person {

    private String name;
    private int age;  // only visible to current class
    private char gender;

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Person(String emre){
        this.name=name;
    }
  /*  public void setAge(int age) {
        this.age = age;
    }*/

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
