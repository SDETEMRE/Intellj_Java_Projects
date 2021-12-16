package Day_33_classObject_Constructor;

public class studentClassTest {
    public static void main(String[] args) {

        studentClass s1 = new studentClass("mike", 17, 'M', 2017, "Java");
        studentClass s2 = new studentClass("Smith", 25,'M',1999,"TS");

        s1.attendLecture();
        s2.attendLab();

    }
}
