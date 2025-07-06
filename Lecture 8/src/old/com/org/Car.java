package old.com.org;

public class Car {
    public String color;
    public String model;
    private double fuel;
    long costOfPurchase;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuel=").append(fuel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }

    public Car(){}

    public Car(String color, String model, double fuel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuel = fuel;
        this.costOfPurchase = costOfPurchase;
    }
}
