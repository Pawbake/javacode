// Employee.java
// Parent class Employee
public class Employee {
    private int salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("working as an employee!");
    }

    public int getSalary() {
        return salary;
    }
}

// Child class User
public class User extends Employee {
    public User(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("\Managing employees");
    }

    public void addEmployee() {
        System.out.println("\Adding new employee!");
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(40000);
        User mgr = new User(70000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        mgr.work();
        System.out.println("User salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}