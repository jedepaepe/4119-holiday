package eu.epfc.c4119.holiday.entities;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="EMPLOYEE_SEQ", sequenceName = "employee_seq")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SEQ")
    Long id;
    String registration;
    String firstname;
    String lastname;
    String email;

    public Employee() {
    }

    public Employee(Long id, String registration, String firstname, String lastname, String email) {
        this.id = id;
        this.registration = registration;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", registration='" + registration + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
