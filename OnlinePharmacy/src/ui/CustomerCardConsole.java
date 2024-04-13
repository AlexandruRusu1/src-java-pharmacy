package ui;

import domain.CustomerCard;
import operations.CustomerCardService;

import java.sql.Date;
import java.util.Scanner;

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

    private void addCustomerCards(){
        customerCardService.addCustomerCards(1, "Maria", "Popescu","2780209011865", Date.valueOf("09/02/1978"), Date.valueOf("15/08/2020"));
        customerCardService.addCustomerCards(2, "Mihai", "Risteu", "1720108011876", Date.valueOf("08/01/1972"), Date.valueOf("23/04/2019"));
        customerCardService.addCustomerCards(3, "Robert","Matache","1980305011987", Date.valueOf("05/03/1998"), Date.valueOf("01/03/2021"));
        customerCardService.addCustomerCards(4, "Ana",   "Budiu",  "2560627011567", Date.valueOf("27/06/1956"), Date.valueOf("15/08/2018"));
        customerCardService.addCustomerCards(5, "Eugen", "Muresan","1660609011854", Date.valueOf("09/06/1966"), Date.valueOf("23/04/2021") );
        customerCardService.addCustomerCards(6, "Ion",   "Carlig", "1780318011346", Date.valueOf("18/03/1978"), Date.valueOf("13/07/2019"));
        customerCardService.addCustomerCards(7, "Irina", "Vacaras","2880410011987", Date.valueOf("10/04/1988"), Date.valueOf("23/06/2020"));
        customerCardService.addCustomerCards(8, "Ion",   "Duma",   "1720828011854", Date.valueOf("28/08/1972"), Date.valueOf("25/09/2018"));
        customerCardService.addCustomerCards(9, "Simona","Dumitru","2900618011876", Date.valueOf("18/06/1990"), Date.valueOf("15/07/2021"));
        customerCardService.addCustomerCards(10,"Marian","Anghel", "1890324011879", Date.valueOf("24/03/1989"), Date.valueOf("26/04/2019"));
        try{
            customerCardService.addCustomerCards(2,"Ionela","Mihai","2900908011890",Date.valueOf("08/09/1990"), Date.valueOf("15/08/2020"));
        }catch(RuntimeException re){
            System.out.println(re.getMessage());
            re.printStackTrace();
        }
    }

    public  void menu(){
        System.out.println("------------------------------------");
        System.out.println("0.Close Program");
        System.out.println("1.Add a new customer card");
        System.out.println("2.Display customer cards list");
        System.out.println("3.Update a customer card");
        System.out.println("4.Delete a customer card");
        System.out.println("5.Add a new drug ");
        System.out.println("6.Display drug list");
        System.out.println("7.Delete a drug");
        System.out.println("8.Update a customer card");
        System.out.println("9.Delete a customer card");
        System.out.println("10.Add a new transaction");
        System.out.println("11.Display transactions list");
        System.out.println("12.Update transaction");
        System.out.println("13.Delete transaction");
        System.out.println("14.");
        System.out.println("-------------------------------------");
    }

    public int readOption(String mesage) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print(mesage);
            return scan.nextInt();
        } catch (Exception e) {
            System.out.println("Keep trying!");
            return readOption(mesage);
        }
    }

    public void runMenu(){
        menu();
        int option = readOption("Enter the option: ");
        while(option != 0){
            switch (option){
                case 1:
                    addCustomerCards();
                    break;
                case 2:
                    displayList();
                    break;
                case 3:

            }
        }
    }

}
