public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public int getSize() {
        return size;
    }

    public boolean addEmployee(String fullName, int depart, double salary) {
        if (size >= employees.length) {
            System.out.println("Невозможно добавить сотрудника, штат полный!\n");
            return false;
        }
        Employee newEmployee = new Employee(fullName, depart, salary);
        employees[size++] = newEmployee;
        return true;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                System.out.println("Сотрудник удален!\n");
                return;
            }
        }
    }

    public Employee getEmployeeById(int id) {
        Employee desiredEmployee = new Employee(null, 0, 0);
        for (int i = 0; i < size; i++) {
            if (id == employees[i].getId()) {
                desiredEmployee = employees[i];
            }
        }
        return desiredEmployee;
    }

    public String getListEmployees() {
        String listEmployees = "Список сотрудников\n";
        for (Employee employee : employees) {
            if (employee != null) {
                listEmployees += employee.toString();
            }
        }
        return listEmployees;
    }

    public double calculateAmountSalaryCosts() {
        double amountSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                amountSalary += employee.getSalary();
            }
        }
        return amountSalary;
    }

    public double findMinSalaryEmployee() {
        double minSalary = 999_999.99;
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public double findMaxSalaryEmployee() {
        double maxSalary = 0.00;
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public int findTotalNumberEmployees() {
        int totalEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalEmployees++;
            }
        }
        return totalEmployees;
    }

    public double calculateAverageSalaryCosts() {
        return calculateAmountSalaryCosts() / findTotalNumberEmployees();
    }

    public void displayFullNameEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void indexSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * (percent / 100.00)));
            }
        }
    }

    public String findMinSalaryDeport(int depart) {
        String minSalaryEmployee = null;
        double minSalary = 999_999.99;
        for (Employee employee : employees) {
            if (depart == employee.getDepart() && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee.getFullName();
            }
        }
        return minSalaryEmployee;
    }

    public String findMaxSalaryDeport(int depart) {
        String maxSalaryEmployee = null;
        double maxSalary = 0.00;
        for (Employee employee : employees) {
            if (depart == employee.getDepart() && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee.getFullName();
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateAmountSalaryCostsDepart(int depart) {
        double amountSalary = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepart() == depart) {
                amountSalary += employee.getSalary();
            }
        }
        return amountSalary;
    }

    public double calculateAverageSalaryCostsDepart(int depart) {
        return calculateAmountSalaryCostsDepart(depart) / findTotalNumberEmployees();
    }

    public void indexSalaryDepart(double percent, int depart) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepart() == depart) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() * (percent / 100.00)));
            }
        }
    }

    public void displayEmployeesWithSalaryLessNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.toString());
            }
        }
    }

    public void displayEmployeesWithSalaryMoreNumber(double number) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println(employee.toString());
            }
        }
    }
}
