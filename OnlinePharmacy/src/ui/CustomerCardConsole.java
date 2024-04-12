package ui;

import Domain.CustomerCard;
import operations.CustomerCardService;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
        customerCardService.addCustomerCards(1, "Maria", "Popescu","2780209011865", "09/02/1978", "15/03/2020");
        customerCardService.addCustomerCards(2, "Mihai", "Risteu", "1720108011876", 8 / 1 1972, 25.3/2019);
        customerCardService.addCustomerCards(3, "Robert","Matache","1980305011987", 05/ 3/1998, 01/ 3/2021);
        customerCardService.addCustomerCards(4, "Ana",   "Budiu",  "2560627011567", 27/ 6/1956, 15/ 8/2018);
        customerCardService.addCustomerCards(5, "Eugen", "Muresan","1660609011854", 09/ 6/1966, 23/ 4/2021 );
        customerCardService.addCustomerCards(6, "Ion",   "Carlig", "1780318011346", 18/ 3/1978, 13/ 7/2019);
        customerCardService.addCustomerCards(7, "Irina", "Vacaras","2880410011987", 10/ 4/1988, 23/ 6/2020);
        customerCardService.addCustomerCards(8, "Ion",   "Duma",   "1720828011854", 28/ 8/1972, 25/ 9/2018);
        customerCardService.addCustomerCards(9, "Simona","Dumitru","2900618011876",  12/ 9/2020);
        customerCardService.addCustomerCards(10,"Marian","Anghel", "1890324011879", 23/ 3/1989, 26/ 4/2019);
        try{
            customerCardService.addCustomerCards(2,"Ionela","Mihai","2900908011890", "8/9/1990", "15/8/2020");
        }catch(RuntimeException re){
            System.out.println(re.getMessage());
            re.printStackTrace();
        }
    }

}
