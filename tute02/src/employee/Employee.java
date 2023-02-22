package employee;

import java.util.Objects;

/**
 * Create an `Employee` class which has private fields for
 * an employee's name and salary and appropriate getters,
 * setters, and constructors. Document the class with JavaDoc.
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the name of the employee
     * @return a string name of employee
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the employee
     * @param newName new string to set
     */
    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return "Employee " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this) // Reflexive property
            return true;
        if (!obj.getClass().equals(this.getClass())) {
            return false;
        }
        // Once we get to this point, we know they are the same type
        Employee e = (Employee) obj;

        return Objects.equals(this.name, e.name) && Objects.equals(this.salary, e.salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", 100.2);
        System.out.println(e);
        System.out.println(e.toString());

        // Manager m = new Manager("Smith", 1234.5678, LocalDate.now());
        // System.out.println(m);
    }
}
