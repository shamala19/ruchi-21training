public class ruchijavaconst{
    String name;
    int empage;
    int empid;
    int contactno;
    String empcurrentcity;

    void info() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age : " + empage);
        System.out.println("Employee ID : " + empid);
        System.out.println("Employee Contact Number : " + contactno);
        System.out.println("Employee City : " + empcurrentcity);

    }

    public static void main(String[] args) {


        ruchijavaconst Employee = new ruchijavaconst();

        Employee.name = "SANJAY P";
        Employee.empage = 22;
        Employee.empid = 23191;
        Employee.contactno = 1234567890;
        Employee.empcurrentcity = "chennai";

        Employee.info();
    }
}

