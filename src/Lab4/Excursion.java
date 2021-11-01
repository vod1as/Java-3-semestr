package Lab4;

public class Excursion implements Priceable{
    private String name;
    private double price;
    private double peoples;

    public Excursion(String name, double price, double peoples) {
        this.name = name;
        this.price = price;
        this.peoples = peoples;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price*peoples;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPeoples(double peoples) {
        this.peoples = peoples;
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "name='" + name + '\'' +
                ",all tickets price=" + price +
                ", peoples=" + peoples +
                '}';
    }
}
