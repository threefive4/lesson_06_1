package ua.lviv.lgs.one;

public class Main {
    public static void main(String[] args) {
        EmployeeHourRate h = new EmployeeHourRate();
        h.annualSalary();
        EmployeeFixedMonthly m = new EmployeeFixedMonthly();
        m.annualSalary();
    }
}
