package old.Inheritance;

public class MotorCycle extends TwoWheeler {
    private double petrolCapacity;

    public void start(){
        System.out.println("Starting");
    }

    public void setPetrolCapacity(double petrolCapacity) {
        this.petrolCapacity = petrolCapacity;
    }

    public double getPetrolCapacity() {
        return petrolCapacity;
    }
}
