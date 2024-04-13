package domain;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;


public class CustomerCard extends BaseEntity {
    private String firstName;
    private String LastName;
    private String CNP;              //cnp  must be unique!!!
    private LocalDate bornDate;
    private LocalDate dateOfRegistration;

    public CustomerCard(int id, String firstName, String lastName, String CNP, LocalDate bornDate, LocalDate dateOfRegistration) {
        super(id);
        this.firstName = firstName;
        LastName = lastName;
        this.CNP = CNP;
        this.bornDate = bornDate;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public LocalDate getBornDate() {
        return  bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(LocalDate dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }


    @Override
    public String toString() {
        return "CustomerCard{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", CNP='" + CNP + '\'' +
                ", bornDate=" + bornDate +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }
}
