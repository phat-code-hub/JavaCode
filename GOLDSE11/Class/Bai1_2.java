package GOLDSE11.Class;

class Employee {
    // private int empNo;
    protected int empNo;
    public String empName;

    public Employee(int empNo, String name) {
        this.empNo = empNo;
        this.empName = name;
    }

    public void disp() {
        System.out.println("NO: " + empNo);
        System.out.println("Name: " + empName);
    };
}

public class Bai1_2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100, "Duke");
        emp1.empNo = 20;
        emp1.disp();
    }
}
