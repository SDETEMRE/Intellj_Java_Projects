package Day_33_classObject_Constructor;

public class studentClass {

    String name;
    int age;
    char gender;
    int year;
    String course;
    String university = "Cybertek";


    public studentClass(String name, int age, char gender, int year, String course){

       this.name = name;
       this.age = age;
       this.gender = gender;
       this.year = year;
       this.course = course;
       this.university = university;

    }
    public void attendLecture(){

        System.out.println(name + " is attending lecture");
    }
    public void submitAssignment(){
        System.out.println(name + " is submitting assignment");
    }
    public void attendLab(){
        System.out.println(name +  " is attending lable");
    }


}

