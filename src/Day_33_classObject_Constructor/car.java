package Day_33_classObject_Constructor;

public class car {

    String model;
    String make;
    int year;
    double mile;
    String color;
    // create constructor
    public car(){
        model = "Honda";
        make = "Civic";
        year = 2020;
        mile = 5000;
        color = "red";
    }
    public car(String mo, String ma, int yr ,double ml ,String cl){

        model = mo;
        make = ma;
        year = yr;
        mile = ml;
        color = cl;
    }

    public car(String model, String make, int year, int mile,String color){
       this.model=model;
       this.make=make;
       this.year=year;
       this.mile=mile;
       this.color=color;
    }


// 2 thing need to be clear
    //1.how we create it
    //2.what are those constructors responsibilities


}
