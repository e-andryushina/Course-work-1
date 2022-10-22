public class EmployeeReport {

    public static Employee[] employees;
    private static double salaryMonthTotal;
    private double salaryMonthMin = Double.MAX_VALUE;
    private double salaryMonthMax = Double.MIN_VALUE;
    private String employeeMaxSalary;
    private String employeeMinSalary;

    public EmployeeReport (int reportLength) {
        this.employees = new Employee[reportLength];
    }

    public static int  employeeQuantity() {
        int employeeQuantity = 0;
        for (Employee employee : employees) {
            if (employee != null)
                employeeQuantity++;
        }
        return employeeQuantity;
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
            else {
                System.out.println ("Вакансия");
            }
        }
    }

    public double salaryMonthTotal() {

        for (Employee employee : employees) {
            if (employee != null) {
                salaryMonthTotal += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты за месяц составляет " + salaryMonthTotal + " рублей.");
        return salaryMonthTotal;
    }


    public double salaryMonthMax() {

        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salaryMonthMax) {
                salaryMonthMax = employee.getSalary();
                employeeMaxSalary = employee.getEmployee();
            }
        }
        System.out.println("У работника " + employeeMaxSalary +
                " максимальная зарплата - " + salaryMonthMax +
                " рублей.");
        return salaryMonthMax;
    }


    public double salaryMonthMin() {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryMonthMin) {
                salaryMonthMin = employee.getSalary();
                employeeMinSalary = employee.getEmployee();
            }
        }
        System.out.println("У работника " + employeeMinSalary +
                " минимальная зарплата - " + salaryMonthMin + " рублей.");
        return salaryMonthMin;
    }

    public double salaryMonthAverage() {
        double salaryMonthAverage = salaryMonthTotal() / employeeQuantity();
        System.out.println("Средняя зарплата работников составляет: " + salaryMonthAverage);
        return salaryMonthAverage;
    }


    public void salaryIndexation(double salaryIndex) {
        System.out.println("Заработная плата работников после идексации, руб.");
        for (Employee employee : employees) {
            if (employee != null) {
                double newSalary = employee.getSalary() * salaryIndex;
                employee.setSalary(newSalary);
                System.out.println(employee.getEmployeeID() +
                        "/" + employee.getEmployee() +
                        "/" + employee.getSalary());
            }
            return;
        }
    }

    public void findLessThan(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee);
            }
            return;
        }
    }


    public void findMoreThanOrEqualTo(int number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println(employee);
            }
            return;
        }
    }
}





