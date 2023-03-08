//java program to print the employees info with constructor
public class Employee {
    String name;                // instance variable to store name of employee
    int yearOfJoining;          // instance variable to store year of joining of employee
    double salary;              // instance variable to store salary of employee
    String address;             // instance variable to store address of employee

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;               // constructor to initialize instance variables with values passed as parameters
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public static void main(String[] args) {
        // create three Employee objects with values for name, year of joining, salary, and address
        Employee employee1 = new Employee("Robert", 1994, 50000, "64C- Walls Street");
        Employee employee2 = new Employee("Sam", 2000, 40000, "68D- Walls Street");
        Employee employee3 = new Employee("John", 1999, 45000, "26B- Walls Street");

        // print the header for the employee information
        System.out.println("Name\tYear of joining\tSalary\t\tAddress");

        // print the information of each employee, separated by tabs to align columns
        System.out.println(employee1.name + "\t" + employee1.yearOfJoining + "\t\t" + employee1.salary + "\t\t" + employee1.address);
        System.out.println(employee2.name + "\t" + employee2.yearOfJoining + "\t\t" + employee2.salary + "\t\t" + employee2.address);
        System.out.println(employee3.name + "\t" + employee3.yearOfJoining + "\t\t" + employee3.salary + "\t\t" + employee3.address);
    }
}
