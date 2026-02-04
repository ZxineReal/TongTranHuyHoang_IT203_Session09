package baitap.gioi.baitap3;

import java.text.NumberFormat;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Tên: " + name);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Lương: " + nf.format(salary));
    }

    public double calculateSalary() {
        return salary;
    }
}
