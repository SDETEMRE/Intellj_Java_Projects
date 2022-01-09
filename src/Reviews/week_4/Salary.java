package Reviews.week_4;

public class Salary {
    // attributes : rate (how much you make an hour) 45-75 an hour / 15 dollars
    //            : weeklyHour , taxRate
    // actions    : setInfo() - > initilize your values
    // salary : rate * weeklyHour * 52
    //            totalTax: salary*taxRate
    //            salaryAfterTax()

    double rate;
    int weeklyHour;
    double taxRate;

    public void setInfo(double r, int h, double t){
        rate= r;
        weeklyHour=h;
        taxRate=t;

    }
    public double salary(){
        return rate*weeklyHour*52;
    }
    public double totalTax(){
        return salary()*taxRate;
    }
    public double salaryAfterTax(){
        return salary()-totalTax();
    }



}

