

public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("wed", 1, 30000);
        employees[1] = new Employee("ivanov", 2, 40000);
        Employee.displayListEmployees(employees);
        Employee.calculateAmountSalaryCosts(employees);
    }
}