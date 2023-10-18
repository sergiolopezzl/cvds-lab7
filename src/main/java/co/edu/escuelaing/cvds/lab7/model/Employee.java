package co.edu.escuelaing.cvds.lab7.model;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @Column(name = "employeeId")
    private String employeeId;

    @Column(name = "firstName")
    private String firstName;

    //@Column(name = "lastName")
    //private String lastName;
    //@Column(name = "role")
    //private String role;
    //@Column(name = "salary")
    //private double salary;

    public Employee(String employeeId, String firstName) {
        this.employeeId = employeeId;
        this.firstName = firstName;
    }

    public Employee() {

    }
    // Getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(firstName, employee.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
