package CodeWithMosh;

import Day_36_staticClassMembers.DinnerTest;

public class Employee {

    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage() {
        return calculateWage(0);
    }

    private int setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        }
       return this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative");
        }
     return   this.hourlyRate = hourlyRate;

    }
    private int getHourlyRate() {
            return hourlyRate;
        }

    }


