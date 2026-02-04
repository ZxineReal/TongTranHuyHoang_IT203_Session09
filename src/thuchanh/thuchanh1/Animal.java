package thuchanh.thuchanh1;

import java.util.Scanner;

public class Animal {
    private String animalName;
    private int numberOfLegs;
    private String furColor;
    private int everageLifeExpectancy;

    public Animal(){
    };

    public Animal(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy) {
        this.animalName = animalName;
        this.numberOfLegs = numberOfLegs;
        this.furColor = furColor;
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getEverageLifeExpectancy() {
        return everageLifeExpectancy;
    }

    public void setEverageLifeExpectancy(int everageLifeExpectancy) {
        this.everageLifeExpectancy = everageLifeExpectancy;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên động vật:");
        animalName = sc.nextLine();
        System.out.println("Nhâp số chân:");
        numberOfLegs = sc.nextInt();
        System.out.println("Nhập màu lông:");
        furColor = sc.nextLine();
        System.out.println("Nhập tuổi thọ trung bình");
        everageLifeExpectancy = sc.nextInt();
    }

    public void display() {
        System.out.println("Tên: " + animalName);
        System.out.println("Số chân: " + numberOfLegs);
        System.out.println("Màu lông: " + furColor);
        System.out.println("Tuổi thọ trung bình: " + everageLifeExpectancy);
    }
}
