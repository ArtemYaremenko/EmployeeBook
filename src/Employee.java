import java.util.Objects;

public class Employee {
    static int i = 0;
    private final String fullName;
    private int depart;
    private double salary;
    private int id = 0;

    public Employee(String fullName, int depart, double salary) {
        id = ++i;
        this.fullName = fullName;
        this.depart = depart;
        this.salary = salary;
        //i++;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepart() {
        return depart;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public void setSalary(double salary) {
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

}
