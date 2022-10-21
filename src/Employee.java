import java.util.Objects;

public class Employee {

    private static int countEmployeeID = 1;
    private final int employeeID;
    private final String employee;
    private String businessUnit;
    private double salary;


    public Employee (String employee, String businessUnit, double salary) {
        this.employeeID = countEmployeeID++;
        this.employee = employee;
        this.businessUnit = businessUnit;
        this.salary = salary;

    }

    public String getEmployee() {
        return employee;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public double getSalary() {
        return salary;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "ID: " + employeeID + "/ Employee:" + employee + "/ Salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee1 = (Employee) o;
        return salary == employee1.salary && employeeID == employee1.employeeID && Objects.equals(employee, employee1.employee) && Objects.equals(businessUnit, employee1.businessUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, businessUnit, salary, employeeID);
    }
}
