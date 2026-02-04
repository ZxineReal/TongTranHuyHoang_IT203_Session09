package thuchanh.thuchanh2;

import java.util.Scanner;

public class AirConditioner extends Machine{
    private int coolingCapacity;
    private String energyEfficiency;

    public AirConditioner() {
    }

    public AirConditioner(String model, String manufacturer, int yearOfManufacture, int power, String energyEfficiency, int coolingCapacity) {
        super(model, manufacturer, yearOfManufacture, power);
        this.energyEfficiency = energyEfficiency;
        this.coolingCapacity = coolingCapacity;
    }

    public int getCoolingCapacity() {
        return coolingCapacity;
    }

    public void setCoolingCapacity(int coolingCapacity) {
        this.coolingCapacity = coolingCapacity;
    }

    public String getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(String energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập công suất làm lạnh:");
        coolingCapacity = sc.nextInt();
        System.out.println("Nhập hiệu suất năng lượng:");
        energyEfficiency = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Công suất làm lạnh: " + coolingCapacity);
        System.out.println("Hệu suất năng lượng: " + energyEfficiency);
    }
}
