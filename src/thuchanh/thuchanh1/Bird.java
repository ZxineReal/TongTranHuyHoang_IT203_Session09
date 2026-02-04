package thuchanh.thuchanh1;

import java.util.Scanner;

public class Bird extends Animal{
    private Boolean isFly;
    private String birdSound;

    public Bird() {
    }

    public Bird(String animalName, int numberOfLegs, String furColor, int everageLifeExpectancy, Boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, everageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public Boolean isFly() {
        return isFly;
    }

    public void setFly(Boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Có thể bay được không? (true/false)");
        isFly = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập tiếng hót:");
        birdSound = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println(isFly? "Có thể bay được" : "Không thể bay được");
        System.out.println("Tiếng hót: " + birdSound);
    }
}
