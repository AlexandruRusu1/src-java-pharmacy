package ui;

import domain.Room;
import operations.RoomService;

import java.util.Scanner;

public class RoomConsole {

    private RoomService roomService;

    public RoomConsole(RoomService roomService) {
        this.roomService = roomService;
    }

    public void runConsole() {
        run();

    }

    public void readRoom () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room's ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter room's name: ");
        String name = scanner.next();
        System.out.println("Enter room's price per night: ");
        float pricePerNight = scanner.nextFloat();
        System.out.println("Enter number of beds in the room: ");
        int bedsNumbers = scanner.nextInt();
        System.out.println("Enter room's type: ");
        String type = scanner.next();

        roomService.addRoom(id, name, pricePerNight, bedsNumbers, type);
        displayRooms();

    }

    public void readRoomD () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room's ID you want to delete: ");
        int id = scanner.nextInt();

        roomService.removeRoom(id);
    }

    public void readRoomU () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room's desired price to change: ");
        int price = scanner.nextInt();
        System.out.println("Enter room's new price: ");
        int newPrice = scanner.nextInt();

        roomService.updateRoom(price, newPrice);

    }

    public void addRooms () {

        roomService.addRoom(1,"camera1", 100, 1, "Regular");
        roomService.addRoom(2,"camera2", 200, 2, "Regular");
        roomService.addRoom(3,"camera3", 300, 3, "Regular");
        roomService.addRoom(4,"camera4", 300, 1, "Business");
        roomService.addRoom(5,"camera5", 400, 2, "Business");
        roomService.addRoom(6,"camera6", 500, 3, "Business");
        roomService.addRoom(7,"camera7", 500, 1, "Executive");
        roomService.addRoom(8,"camera8", 600, 2, "Executive");
        roomService.addRoom(9,"camera9", 700, 3, "Executive");
        roomService.addRoom(10,"camera10", 900, 2, "VIP");

        displayRooms();

    }
    public void displayRooms () {

        for (Room room: roomService.getAllRooms())
            System.out.println(room);

    }

    public void menu () {

        System.out.println();
        System.out.println("-----------------------");
        System.out.println("|  MENU SELECTION     |");
        System.out.println("-----------------------");
        System.out.println("| Options:            |");
        System.out.println("|  0.Exit             |");
        System.out.println("|  1.Add rooms        |");
        System.out.println("|  2.Insert new room  |");
        System.out.println("-----------------------");
        System.out.println();
    }
    public int option (String msg) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(msg);
            return scanner.nextInt();
        }catch (Exception e) {
            System.out.println("Try again!");
            return option(msg);
        }
    }

    public void run () {
        menu();
        int opt = option("Enter option: ");
        while (opt != 0){
            switch (opt){
                case 1:
                    addRooms();
                    break;
                case 2:
                    readRoom();
                    break;
                default:
                    System.out.println("Invalid option");
            }
            menu();
            opt = option("Enter option: ");
        }
    }
}
