package old.com.GetterSetter;

public class Car {
    private String color;
    private String model;
    private double fuel;
    private long costOfPurchase;

    public Car(String color, String model, double fuel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuel = fuel;
        this.costOfPurchase = costOfPurchase;
    }

    public double getFuel(){ return fuel; }
    public long getCostOfPurchase(){ return costOfPurchase; }
    public String getColor(){return color; }
    public String getModel(){ return model;}

    public void setColor(String color){
        if( color.equalsIgnoreCase("yellow")){
            System.out.println("Can't take car of this color");
        }
        else{
            this.color = color;
        }
    }

}
