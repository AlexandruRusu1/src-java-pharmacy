package operations;

import domain.Room;
import ui.RoomConsole;

import java.util.ArrayList;
import java.util.List;

public class RoomService {

    RoomConsole roomConsole;
    private List<Room> roomList;

    public RoomService() {
        this.roomList = new ArrayList<>();
    }

    public List<Room> getAllRooms() {
        return roomList;
    }

    public void addRoom(int id, String name, float pricePerNight, int bedsNumbers, String type) {

        Room room = new Room(id, name, pricePerNight, bedsNumbers, type);

        if (uniqueID(room.getId())) {
            System.out.println("Room's ID is already used!");
        } else if (room.getBedsNumbers() > 5 || room.getBedsNumbers() < 1){
            System.out.println("Bed number is incorrect!");
        } else {
            roomList.add(room);
        }
    }

    public boolean uniqueID (int id) {
        for (Room room: roomList) {
            if (room.getId() == id)
                return true;
        }
        return false;
    }

    public void removeRoom (int idRemove) {

        for (Room room: roomList) {
            if (idRemove == room.getId())
                roomList.remove(idRemove);

        }
    }

    public void updateRoom (int priceUpdate, int newPrice) {

        for (Room room: roomList)
            if (priceUpdate == room.getPricePerNight())
                room.setPricePerNight(newPrice);

    }
}
