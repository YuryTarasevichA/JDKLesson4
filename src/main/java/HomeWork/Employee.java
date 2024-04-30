package HomeWork;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private final int employeeID;
    private final String phoneNumber;
    private final String name;
    private final int experience;

    public Employee(int employeeID, String phoneNumber, String name, int experience) {
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    //    public int getExperience(LocalDate startDate) {
//        LocalDate today = LocalDate.now();
//        Period period = Period.between(startDate, today);
//        experience = period.getYears();
//        return experience;
//    }
}
