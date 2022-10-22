public class Main {
    private static Employee[] employee = new Employee [10];
    public static void main(String[] args) {

        employee[0] = new Employee("Алексеев Алексей", "5",245643);
        employee[1] = new Employee("Сергеев Сергей", "5", 122456);
        employee[2] = new Employee("Александров Александр", "5", 85320);
        employee[3] = new Employee("Иванов Иван", "5", 135890);
        employee[4] = new Employee("Глебов Глеб", "5", 156885);
        employee[5] = new Employee("Андреев Андрей", "5", 74568);
        employee[6] = new Employee("Екатеринина Екатерина", "5", 98543);
        employee[7] = new Employee("Алехина Алеся", "5", 65439);

        EmployeeReport employeeReport = new EmployeeReport(employee.length);
        employeeReport.salaryMonthMax();
        employeeReport.salaryMonthMin();
        employeeReport.salaryMonthTotal();
        employeeReport.salaryMonthAverage();
        employeeReport.salaryIndexation(0.04d);
        employeeReport.printAllEmployees();
        employeeReport.findLessThan(100_000);
        employeeReport.findMoreThanOrEqualTo(100_000);


        }
    }







