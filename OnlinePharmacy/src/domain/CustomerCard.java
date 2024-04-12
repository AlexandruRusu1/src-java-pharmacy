package domain;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class CustomerCard extends BaseEntity{
    private String firstName;
    private String LastName;
    private String CNP;              //cnp  must be unique!!!
    private Date bornDate;
    private Date dateOfRegistration;

    public CustomerCard(int id, String firstName, String lastName, String CNP, Date bornDate, Date dateOfRegistration) {
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

    public Date getBornDate() {
        return  bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public void date(){
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = (Date) DateFor.parse("08/07/2019");
            System.out.println("Date : "+date);
        }catch (ParseException e) {e.printStackTrace();}
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
