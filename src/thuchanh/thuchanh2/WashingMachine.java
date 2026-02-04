package thuchanh.thuchanh2;

import java.util.Scanner;

public class WashingMachine extends Machine{
    private int capacity;
    private Boolean hasDryer;

    public WashingMachine() {
    }

    public WashingMachine(String model, String manufacturer, int yearOfManufacture, int power, int capacity, Boolean hasDryer) {
        super(model, manufacturer, yearOfManufacture, power);
        this.capacity = capacity;
        this.hasDryer = hasDryer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean getHasDryer() {
        return hasDryer;
    }

    public void setHasDryer(Boolean hasDryer) {
        this.hasDryer = hasDryer;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập dung tích:");
        capacity = sc.nextInt();
        System.out.println("Có tính năng sấy hay không? (true/false)");
        hasDryer = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Dung tích: " + capacity + " kg");
        System.out.println(hasDryer ? "Có tính năng sấy" : "Không có tính năng sấy");
    }
}
