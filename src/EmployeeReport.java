public class EmployeeReport {

    private final Employee[] employees;
    private static int employeeQuantity = 0;

    public EmployeeReport() {
        this.employees = new Employee[10];
    }

    public int employeeQuantity() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                employeeQuantity = i + 1;
        }
        return employeeQuantity;
    }


    public void printAllEmployees() {

        System.out.println("Список работников: ");

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            } else {
                System.out.println("Вакансия");
            }
        }
    }

    public void printAllEmployeesBU(int businessUnit) {

        System.out.println("Список работников отдела " + businessUnit);

        for (Employee employee : employees) {
            if (employee != null && employee.getBusinessUnit() == businessUnit) {
                System.out.println(employee.toStringWithoutBU());
            }
        }
    }

    public double salaryMonthTotal() {
        double salaryMonthTotal = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                salaryMonthTotal += employee.getSalary();
            }
        }
        return salaryMonthTotal;
    }


    public void salaryMonthMax() {
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


    public void salaryMonthMin() {
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

    public void salaryMonthAverage() {
        double salaryMonthAverage = salaryMonthTotal() / employeeQuantity();
        System.out.println("Средняя зарплата работников составляет: " + salaryMonthAverage);

    }


    public void salaryIndexation(double salaryIndex) {
        System.out.println("Заработная плата работников после индексации, руб.");
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * salaryIndex);
                System.out.println(employee);
            }

        }
    }

    public void findLessThan(int sum) {
        System.out.println("Работники с зарплатой меньше " + sum + " рублей.");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < sum) {
                System.out.println(employee);
            } else if (sum < 0) {
                System.out.println("Сумма сравнения не может быть меньше 0");
            }

        }

    }


    public void findMoreThanOrEqualTo(int sum) {
        System.out.println("Работники с зарплатой больше " + sum + " рублей.");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= sum) {
                System.out.println(employee);
            } else if (sum < 0) {
                System.out.println("Сумма сравнения не может быть меньше 0");
            }

        }
    }

    public void addEmployee(String employee, int businessUnit, double salary) {
        if (employeeQuantity() >= employees.length) {
            System.out.println("В штатном расписаниии отсутсвуют вакансии");
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee("Ф.И.О не указаны", 0, 0);
                newEmployee.setEmployee(employee);
                newEmployee.setBusinessUnit(businessUnit);
                newEmployee.setSalary(salary);
                employees[i] = newEmployee;
                return;
            }
        }
    }

    public void removeEmployee(int employeeID) {
        boolean idIsFound = true;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getEmployeeID() == employeeID) {
                System.out.println("ID: " + employees[i].getEmployeeID() +": информация о работнике удалена");
                employees[i] = null;
                return;
            }
            idIsFound = false;
        }
        if (!idIsFound) {
            System.out.println("ID не найден");
        }
    }


    public void changeEmployeeBusinessUnit(int employeeID, int newBusinessUnit) {
        boolean idIsFound = true;
        for (Employee employee : employees) {
            if (employee != null && employee.getEmployeeID() == employeeID) {
                employee.setBusinessUnit(newBusinessUnit);
                return;
            }
            idIsFound = false;
        }
        if (!idIsFound) {
            System.out.println("ID не найден");
        }
    }

    public void changeEmployeeSalary(int employeeID, double newSalary) {
        boolean idIsFound = true;
        for (Employee employee : employees) {
            if (employee != null && employee.getEmployeeID() == employeeID) {
                employee.setSalary(newSalary);
                return;
            }
            idIsFound = false;
        }
        if (!idIsFound) {
            System.out.println("ID не найден");
        }
    }
}




