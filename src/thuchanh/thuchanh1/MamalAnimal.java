package thuchanh.thuchanh1;

import java.util.Scanner;

public class MamalAnimal extends Animal{
    private String foodType;
    private Boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy, String foodType, Boolean isLiveWithHuman, String mamalSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.foodType = foodType;
        this.isLiveWithHuman = isLiveWithHuman;
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Boolean getLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(Boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập loại thức ăn:");
        foodType = sc.nextLine();
        System.out.println("Có sống với con người không? (true/false)");
        isLiveWithHuman = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập tiếng kêu:");
        mamalSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Loại thức ăn: " + foodType);
        System.out.println(isLiveWithHuman ? "Sống chung với con người" : "Không sống với con người");
        System.out.println("Tiếng kêu: " + mamalSound);
    }
}
