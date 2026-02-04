package baitap.kha.baitap1;

public class Student extends Person {
    public String studentId;
    public double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Gpa: " + gpa);
        System.out.println();
    }
}
