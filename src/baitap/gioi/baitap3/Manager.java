package baitap.gioi.baitap3;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Phòng ban: " + department);
    }
}
