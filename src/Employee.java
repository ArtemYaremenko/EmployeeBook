import java.util.Objects;

public class Employee {
    private String fullName;
    private int depart;
    private int salary;
    private static int id = 0;

    public Employee(String fullName, int depart, int salary) {
        this.fullName = fullName;
        this.depart = depart;
        this.salary = salary;
        id++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepart() {
        return depart;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        Employee newEmployee = (Employee) obj;
        return fullName.equals(newEmployee.fullName) && depart == newEmployee.depart && salary == newEmployee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, depart, salary);
    }

    @Override
    public String toString() {
        return "ID - " + id + "\nФИО - " + fullName + "\nОтдел - " + depart + "\nЗ/П - " + salary + "\n\n";
    }

    public static void displayListEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            } else return;
        }
    }

    public static int calculateAmountSalaryCosts(Employee[] employees) {
        int amountSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                amountSalary += employee.getSalary();
            }
        }
        return amountSalary;
    }
}
