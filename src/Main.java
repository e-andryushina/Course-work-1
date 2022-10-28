public class Main {


    public static void main(String[] args) {
        EmployeeReport employeeReport = new EmployeeReport();

        employeeReport.addEmployee("Сергеев Сергей", 3, 122456.0);
        employeeReport.addEmployee("Александров Александр", 1, 85320.0);
        employeeReport.addEmployee("Иванов Иван", 4, 135890.0);
        employeeReport.addEmployee("Маринина Марина", 8, 178990.0);
        employeeReport.addEmployee("Глебов Глеб", 4, 156885.0);
        employeeReport.addEmployee("", 3, 74568.0);
        employeeReport.addEmployee("Екатеринина Екатерина", 1, 98543.0);
        employeeReport.addEmployee("Алехина Алеся", 2, 65439.0);



        employeeReport.printAllEmployeesBU(4);
        System.out.println();

        System.out.println("Сумма затрат на оплату труда составляет: " +
                employeeReport.salaryMonthTotal());
        System.out.println();

        employeeReport.salaryMonthAverage();
        System.out.println();

        employeeReport.salaryMonthMax();
        System.out.println();

        employeeReport.salaryMonthMin();
        System.out.println();

        employeeReport.findLessThan(100_000);
        System.out.println();


        employeeReport.findMoreThanOrEqualTo(100_000);
        System.out.println();

        employeeReport.salaryIndexation(0.04);
        System.out.println();

        employeeReport.changeEmployeeSalary(5, 177904.0);
        System.out.println();

        employeeReport.changeEmployeeBusinessUnit(4, 3);
        System.out.println();

        employeeReport.removeEmployee(8);
        System.out.println();

        employeeReport.printAllEmployees();



    }

}


