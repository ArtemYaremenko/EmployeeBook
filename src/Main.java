

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Ярёменко Артём Владиславович", 1, 90000);
        employeeBook.addEmployee("Назаров Денис Андреевич", 2, 100000);
        employeeBook.addEmployee("Синельников Юрий игоревич", 3, 110000);
        employeeBook.addEmployee("Болотина Татьяна Владимировна", 4, 120000);
        employeeBook.addEmployee("Углов Антон Андреевич", 5, 130000);
        employeeBook.addEmployee("Зотова Наталья Александровна", 1, 140000);
        employeeBook.addEmployee("Юн Виталий Сергеевич", 2, 150000);
        employeeBook.addEmployee("Попов Иван николаевич", 3, 160000);
        employeeBook.addEmployee("Попова Дарья Николаевна", 4, 170000);
        employeeBook.addEmployee("Попов Дмитрий Николаевич", 5, 180000);
        employeeBook.addEmployee("Гоглова наталья Владимировна", 1, 190000);
        employeeBook.getListEmployees();
        System.out.println(employeeBook.calculateAmountSalaryCosts());
        employeeBook.displayFullNameEmployees();
        System.out.println(employeeBook.getListEmployees());
        employeeBook.removeEmployee(1);
        System.out.println(employeeBook.getListEmployees());
        employeeBook.addEmployee("Ярёменко Артём Владиславович", 3, 200000);
        System.out.println(employeeBook.getListEmployees());
        System.out.println(employeeBook.calculateAverageSalaryCosts());
        employeeBook.displayEmployeesWithSalaryLessNumber(150000);
    }
}
