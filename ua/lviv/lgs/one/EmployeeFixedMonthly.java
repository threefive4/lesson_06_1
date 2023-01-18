package ua.lviv.lgs.one;

public class EmployeeFixedMonthly implements Salary {
    int monthlyRate = 650;

    @Override
    public void annualSalary() {
        System.out.println("Annual salary of an employee who works monthly = " + monthlyRate * 12 + " dollars");
    }
}
