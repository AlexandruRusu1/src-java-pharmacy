package domain;

public class Room {
    private int id;
    private String name;
    private float pricePerNight;
    private int bedsNumbers;
    private String type;

    public Room () {

    }
    public Room(int id, String name, float pricePerNight, int bedsNumbers, String type) {
        this.id = id;
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.bedsNumbers = bedsNumbers;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getBedsNumbers() {
        return bedsNumbers;
    }

    public void setBedsNumbers(int bedsNumbers) {
        this.bedsNumbers = bedsNumbers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", bedsNumbers=" + bedsNumbers +
                ", type='" + type + '\'' +
                '}';
    }
}
