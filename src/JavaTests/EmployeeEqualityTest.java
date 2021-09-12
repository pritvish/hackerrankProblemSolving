package JavaTests;

public class EmployeeEqualityTest {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Pat","Ops");
        Employee e2 = new Employee(1,"Pat","Ops");

        System.out.println(e1.equals(e2));
    }
}
