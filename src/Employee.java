import java.util.Objects;

public class Employee {

    private static int countEmployeeID = 1;
    public int employeeID;
    public String employee;
    public String businessUnit;
    public double salary;


    public Employee (String employee, String businessUnit, double salary) {
        this.employeeID = countEmployeeID++;
        this.employee = employee;
        this.businessUnit = businessUnit;
        this.salary = salary;

    }

    public String getEmployee() {
        return employee;
    }



    public double getSalary() {
        return salary;
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
