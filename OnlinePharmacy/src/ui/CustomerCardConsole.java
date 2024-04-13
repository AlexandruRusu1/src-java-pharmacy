package ui;

import domain.CustomerCard;
import operations.CustomerCardService;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class CustomerCardConsole {
    private CustomerCardService customerCardService;

    public CustomerCardConsole(CustomerCardService customerCardService){
        this.customerCardService = customerCardService;
    }

    private void displayList(){
        for(CustomerCard customerCard:customerCardService.getAllCustomerCards()){
            System.out.println(customerCard);
        }
    }
    public void date(){
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date date = (Date) DateFor.parse("08/07/2019");
            System.out.println("Date : "+date);
        }catch (ParseException e) {e.printStackTrace();}
    }

    private void addCustomerCards(){
        customerCardService.addCustomerCards(1, "Maria", "Popescu","2780209011865", LocalDate.of(1978,9,2),  LocalDate.of(2020,5,24));
        customerCardService.addCustomerCards(2, "Mihai", "Risteu", "1720108011876", LocalDate.of(1972,1,8),  LocalDate.of(2019,7,10));
        customerCardService.addCustomerCards(3, "Robert","Matache","1980305011987", LocalDate.of(1998,3,5),  LocalDate.of(2020,2,3 ));
        customerCardService.addCustomerCards(4, "Ana",   "Budiu",  "2560627011567", LocalDate.of(1956,6,27), LocalDate.of(2019,7,10));
        customerCardService.addCustomerCards(5, "Eugen", "Muresan","1660609011854", LocalDate.of(1966,6,9),  LocalDate.of(2020,5,24));
        customerCardService.addCustomerCards(6, "Ion",   "Carlig", "1780318011346", LocalDate.of(1978,3,18), LocalDate.of(2020,2,10));
        customerCardService.addCustomerCards(7, "Irina", "Vacaras","2880410011987", LocalDate.of(1988,4,10), LocalDate.of(2019,10,5));
        customerCardService.addCustomerCards(8, "Ion",   "Duma",   "1720828011854", LocalDate.of(1972,8,28), LocalDate.of(2019,10,5));
        customerCardService.addCustomerCards(9, "Simona","Dumitru","2900618011876", LocalDate.of(1990,6,18),  LocalDate.of(2018,12,5));
        customerCardService.addCustomerCards(10,"Marian","Anghel", "1890324011879", LocalDate.of(1989,3,24), LocalDate.of(2018,12,5));
        try{
            customerCardService.addCustomerCards(2,"Ionela","Mihai","2900908011890", LocalDate.of(1990,9,8), LocalDate.of(2021,9,10));
        }catch(RuntimeException re){
            System.out.println(re.getMessage());
            re.printStackTrace();
        }
    }

}
