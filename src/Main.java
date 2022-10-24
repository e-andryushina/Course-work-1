public class Main {

    public static Employee[] employee = new Employee[10];


    public static void main(String[] args) {
        EmployeeReport employeeReport = new EmployeeReport();

        employee[0] = new Employee("Алексеев Алексей", "5", 245643.0);
        employee[1] = new Employee("Сергеев Сергей", "5", 122456.0);
        employee[2] = new Employee("Александров Александр", "5", 85320.0);
        employee[3] = new Employee("Иванов Иван", "5", 135890.0);
        employee[4] = new Employee("Глебов Глеб", "5", 156885.0);
        employee[5] = new Employee("Андреев Андрей", "5", 74568.0);
        employee[6] = new Employee("Екатеринина Екатерина", "5", 98543.0);
        employee[7] = new Employee("Алехина Алеся", "5", 65439.0);




        employeeReport.printAllEmployees(employee);
        System.out.println();

        System.out.println("Сумма затрат на оплату труда составляет: " +
                employeeReport.salaryMonthTotal(employee));
        System.out.println();

        employeeReport.salaryMonthAverage(employee);
        System.out.println();

        employeeReport.salaryMonthMax(employee);
        System.out.println();

        employeeReport.salaryMonthMin(employee);
        System.out.println();

        employeeReport.findLessThan(employee,100_000);
        System.out.println();


        employeeReport.findMoreThanOrEqualTo(employee,100_000);
        System.out.println();

        employeeReport.salaryIndexation(employee,0.04);
        System.out.println();

    }

}


