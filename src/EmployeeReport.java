public class EmployeeReport {


    public int  employeeQuantity(Employee[] employees) {
        int employeeQuantity = 0;
        for (Employee employee : employees) {
            if (employee != null)
                employeeQuantity++;
        }
        return employeeQuantity;
    }

    public void printAllEmployees(Employee[] employees) {
        System.out.println("Список работников");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
            else {
                System.out.println ("Вакансия");
            }
        }
    }

    public double salaryMonthTotal(Employee[] employees) {
        double salaryMonthTotal=0;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryMonthTotal += employee.getSalary();
            }
        }
        return salaryMonthTotal;
    }


    public void salaryMonthMax(Employee[] employees) {
        String employeeMaxSalary = null;
        double salaryMonthMax = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salaryMonthMax) {
                salaryMonthMax = employee.getSalary();
                employeeMaxSalary = employee.getEmployee();
            }
        }
        System.out.println("У работника " + employeeMaxSalary +
                " максимальная зарплата - " + salaryMonthMax +
                " рублей.");
    }


    public void salaryMonthMin(Employee[] employees) {
        String employeeMinSalary = null;
        double salaryMonthMin = Double.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salaryMonthMin) {
                salaryMonthMin = employee.getSalary();
                employeeMinSalary = employee.getEmployee();
            }
        }
        System.out.println("У работника " + employeeMinSalary +
                " минимальная зарплата - " + salaryMonthMin + " рублей.");

    }

    public void salaryMonthAverage(Employee[] employees) {
        double salaryMonthAverage = salaryMonthTotal(employees) / employeeQuantity(employees);
        System.out.println("Средняя зарплата работников составляет: " + salaryMonthAverage);

    }


    public void salaryIndexation(Employee[] employees, double salaryIndex) {
        System.out.println("Заработная плата работников после идексации, руб.");
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * salaryIndex);
                System.out.println(employee);
            }

        }
    }

    public void findLessThan(Employee[] employees, int sum) {
        System.out.println("Работники с зарплатой меньше " + sum + " рублей.");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < sum) {
                System.out.println(employee);
            }
            else if (sum < 0) {
                System.out.println("Сумма сравнения не может быть меньше 0");
            }

        }

    }


    public void findMoreThanOrEqualTo(Employee[] employees, int sum) {
        System.out.println("Работники с зарплатой больше " + sum + " рублей.");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= sum) {
                System.out.println(employee);
            }
            else if (sum < 0) {
                System.out.println("Сумма сравнения не может быть меньше 0");
            }

        }
    }
}





