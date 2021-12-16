package Day_36_staticClassMembers;

public class Student {

    String name;
    int age;
    int idNumber; // belongs the object
    static String school = "Cybertek"; // belongs the class

    public Student(String name, int age, int idNumber, String school) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        this.school = school;
    }
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", idNumber=" + idNumber + ", school='" + school + '\'' +
                '}';
    }
}
