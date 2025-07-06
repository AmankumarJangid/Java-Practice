public class Car {
    int noOfWheels;
    String color;
    float currentFuelInLitres;
    int noOfSpeed;
    int maxSpeed;

    static int noOfCarSold;
    //static block
    static { // when ever the compiler sees the use of class name just ever first time
        // Or loaded first time
        noOfCarSold = 0;
        System.out.println("This is a static block");
    }
    //normal block
    { // run before constructor is used
        noOfCarSold++;
        System.out.println("This is a normal block");
    }

    Car(String color){
        this.color = color;
        noOfWheels = 4;
        maxSpeed = 150;
        currentFuelInLitres =2 ;
    }

    Car(){
        this("Black");
    }

    public Car start(){// this keyword use "to take reference of own object "
        // now to return in which reference I am in now
        if( currentFuelInLitres <= 0){
            System.out.println("Car is out of fuel , can't start");
        }
        else if( currentFuelInLitres < 5){
            System.out.println("Car is in reserved mode, please refuel");
        }
        else {
            System.out.println("Car is started");
        }
        return this; // current object is 'this'
    }

    public void drive(){
            System.out.println("Car is driving");
            currentFuelInLitres--;
    }

    public void addFuel(float currentFuelInLitres){
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLitres;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm in finalize");
    }
}
