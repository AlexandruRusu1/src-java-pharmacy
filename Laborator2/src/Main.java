import operations.RoomService;
import ui.RoomConsole;

public class Main {
    public static void main(String[] args) {

        RoomService roomService = new RoomService();
        RoomConsole roomConsole = new RoomConsole(roomService);

        roomConsole.runConsole();

    }
}