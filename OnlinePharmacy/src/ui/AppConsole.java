package ui;

import domain.CustomerCard;
import domain.Drug;
import service.CustomerCardService;
import service.DrugService;

import java.util.Scanner;

public class AppConsole {
    private CustomerCardService customerCardService;
    private DrugService drugService;

    public AppConsole(CustomerCardService customerCardService, DrugService drugService) {
        this.customerCardService = customerCardService;
        this.drugService = drugService;
    }

    private void displayList () {
        for(CustomerCard customerCard:customerCardService.getAllCustomerCards()){
            System.out.println(customerCard);
        }
    }

    private void displayDrugList () {
        for (Drug drug : drugService.getAllDrugs())
            System.out.println(drug);
    }

    private void addDrugs () {
        drugService.addDrug(1, "Amlodipine", "Norvasc", 75.90, true);
        drugService.addDrug(2, "Adalimumab", "Humira", 55.99, false);
        drugService.addDrug(3, "Pembrolizumab", "Keytruda", 67.99, true);
        drugService.addDrug(4, "Metformin", "Glucophage", 99.99, true);
        drugService.addDrug(5, "Apixaban", "Eliquis", 20.55, false);
        drugService.addDrug(6, "Escitalopram", "Traton", 25.01, false);
        drugService.addDrug(7, "Atorvastatin", "Statin", 150.00, true);
        drugService.addDrug(8, "Nivolumab", "Opdivo", 85.85, true);
        drugService.addDrug(9, "Levothyroxine", "Synthro", 66.86, true);
        drugService.addDrug(10,"Pantoprazole", "Protonix", 10.99, false);
    }

    private void updateDrugs () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Drug's ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter new price: ");
        double newPrice = scanner.nextInt();

        drugService.updateDrug(id, newPrice);

    }

    private void removeDrugs () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room's ID: ");
        int id = scanner.nextInt();

        try {
            drugService.removeDrug(id);
            System.out.println("Drug deleted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
