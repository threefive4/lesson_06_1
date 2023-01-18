package ua.lviv.lgs.one;

public class EmployeeHourRate implements Salary {
    int hourRate = 5;

    @Override
    public void annualSalary() {
        System.out.println("Annual salary of an employee who works hourly = " + hourRate * 5 * 5 * 4 * 12 + " dollars");
    }

}
