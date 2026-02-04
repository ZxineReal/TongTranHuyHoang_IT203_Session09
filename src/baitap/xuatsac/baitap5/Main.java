package baitap.xuatsac.baitap5;

import baitap.gioi.baitap3.Employee;

import java.text.NumberFormat;

public class Main {
    static void main() {
        OfficeEmployee e01 = new OfficeEmployee("Nguyễn Văn A", 10000000);
        OfficeEmployee e02 = new OfficeEmployee("Trần Văn B", 11000000);
        OfficeEmployee e03 = new OfficeEmployee("Atmin Trần", 3000000);

        ProductionEmployee pe01 = new ProductionEmployee("Lê Thị C", 7000000);
        ProductionEmployee pe02 = new ProductionEmployee("Bùi Thị D", 7500000);
        ProductionEmployee pe03 = new ProductionEmployee("Phan Văn E", 8000000);

        Employee[] eList = {e01, e02, e03, pe01, pe02, pe03};

        double totalSalary = 0;
        for (int i = 0; i < eList.length; i++) {
            totalSalary += eList[i].calculateSalary();
        }
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println("Tổng lương công ty phải trả là: " + nf.format(totalSalary));
    }
}
