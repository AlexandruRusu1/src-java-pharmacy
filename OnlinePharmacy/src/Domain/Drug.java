package Domain;

public class Drug extends BaseEntity {

    private String name;
    private String producer;
    private double price;
    private boolean prescription;

    public Drug(int id, String name, String producer, double price, boolean prescription) {
        super(id);
        this.name = name;
        this.producer = producer;
        this.price = price;
        this.prescription = prescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0 )
            this.price = price;
        else
            throw new RuntimeException("Price must be positive and higher than 0");
    }

    public boolean isPrescription() {
        return prescription;
    }

    public void setPrescription(boolean prescription) {
        this.prescription = prescription;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                ", prescription=" + prescription +
                '}';
    }
}
