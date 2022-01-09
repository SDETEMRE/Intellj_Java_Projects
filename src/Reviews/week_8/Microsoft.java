package Reviews.week_8;

public class Microsoft {
    public static void main(String[] args) {

      //  Employee emp1 = new Employee("emre","")

        int [] nums = {1,2,3};

        //my data type will be from employee class, dataType is Employee

  //      Employee emp1 = new Employee("Eyup","SDET",10,100.000);

        Employee[] testers = {
                new Employee("Eyup","SDET",10,100_000),
                new Employee("Vasillica","ScrumMaster",5,120_000),
                new Employee("Selena","SDET",7,85_000),
                new Employee("Merve","Senior_SDET",8,150_000)
        };

        double minSalary = Double.MAX_VALUE;
        double maxSalary = Double.MIN_VALUE;

        String personWhoMakesMax="";
        String personWhoMakesMın="";


        for(Employee each : testers){
            if(each.salary>maxSalary){
                maxSalary=each.salary;
                personWhoMakesMax = each.name;
                System.out.println(each.companyName);
            }
            if(each.salary<minSalary){
                minSalary=each.salary;
                personWhoMakesMın = each.name;
            }


        }

        System.out.println(personWhoMakesMax + " makes maximum salary : " + maxSalary);
        System.out.println(personWhoMakesMın + " makes minimum salary : " + minSalary);








    }
}
