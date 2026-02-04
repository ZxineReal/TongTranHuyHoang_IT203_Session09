package baitap.xuatsac.baitap6;

import java.text.NumberFormat;

public class Main {
    static void main() {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(3, 5);

        Shape[] sList = {c, r};

        double totalArea = 0;
        for (int i = 0; i < sList.length; i++) {
            totalArea += sList[i].area();
        }

        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Tổng diện tích: " + nf.format(totalArea));
    }
}
