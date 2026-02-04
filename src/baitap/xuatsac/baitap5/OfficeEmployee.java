package baitap.xuatsac.baitap5;

import baitap.gioi.baitap3.Employee;

public class OfficeEmployee extends Employee {

    public OfficeEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 2000000;
    }
}
