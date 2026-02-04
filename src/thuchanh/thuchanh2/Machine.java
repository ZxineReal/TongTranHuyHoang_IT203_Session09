package thuchanh.thuchanh2;

import java.util.Scanner;

public class Machine {
    private String model;
    private String manufacturer;
    private int yearOfManufacture;
    private int power;

    public Machine() {
    }

    public Machine(String model, String manufacturer, int yearOfManufacture, int power) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mẫu may:");
        model = sc.nextLine();
        System.out.println("Nhập nhà sản xuất:");
        manufacturer = sc.nextLine();
        System.out.println("Nhập năm sản xuất:");
        yearOfManufacture = sc.nextInt();
        System.out.println("Nhập công suất:");
        power = sc.nextInt();
    }

    public void display() {
        System.out.println("Mẫu máy: " + model);
        System.out.println("Nhà sản xuất: " + manufacturer);
        System.out.println("Năm sản xuất: " + yearOfManufacture);
        System.out.println("Công suất: " + power + " kW");
    }
}
