package baitap.xuatsac.baitap5;

import baitap.gioi.baitap3.Employee;

public class ProductionEmployee extends Employee {
    public ProductionEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + 1000000;
    }
}
