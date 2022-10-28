import java.util.Objects;

public class Employee {

    private static int countEmployeeID = 1;
    private final int employeeID;
    private String employee;
    private int businessUnit;
    private double salary;


    public Employee (String employee, int businessUnit, double salary) {
        this.employeeID = countEmployeeID++;
        this.employee = employee;
        this.businessUnit = businessUnit;
        this.salary = salary;

    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployee() {
        return employee;
    }

    public int getBusinessUnit() {
        return businessUnit;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployee(String employee) {
        if (employee==null || employee.isEmpty() || employee.isBlank()) {
            System.out.println("ID:" + getEmployeeID() + ": Пожалуйста, проверьте введенные данные (Ф.И.О.)");
            return;
        }

        this.employee = employee;
    }


    public void setSalary(double salary) {
        if (salary > 0) {
        this.salary = salary;
    }
        else this.salary = Math.abs(salary);

    }



    public void setBusinessUnit(int businessUnit) {
        if (businessUnit > 0 && businessUnit < 6) {
            this.businessUnit = businessUnit;
        }
        else {
            System.out.println("ID: " + getEmployeeID() + ": информация по подразделению введена некорректно");
        }
    }

    @Override
    public String toString() {
        return "ID: " + employeeID + "/ Employee:" + employee + "/ Salary: " + salary + "/Business unit: " + businessUnit;
    }

    public String toStringWithoutBU() {
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
