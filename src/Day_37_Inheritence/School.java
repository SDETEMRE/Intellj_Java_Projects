package Day_37_Inheritence;

public class School {
    public static void main(String[] args) {

        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();

        person.name = "Mike";
        person.age = 35;
        person.gender ='M';

        student.name ="Smith";
        student.age = 30;
        student.gender= 'M';
        student.studentID = 100;

        person.eat("Steak");
        student.eat("Pizza");



    }
}
