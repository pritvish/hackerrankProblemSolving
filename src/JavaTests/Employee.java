package JavaTests;

import java.util.Objects;

public class Employee {

    private Integer empId;
    private String name;
    private String dept;

    public Employee(Integer empId, String name, String dept) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
    }

    public Employee() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return getEmpId().equals(employee.getEmpId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId());
    }
}
