public class Driver {

    static int minimumDrivingAge = 18;
    String name;
    int age;
    public boolean isLegalDriver(){
        return this.age >= minimumDrivingAge;
    }

    {
        System.out.println("Car Sold");
    }
    Driver(String name, int age){ // Parameterized constructor
        this.name = name;
        this.age = age;
    }
    Driver(){ // Constructor (Default)
        this.name = "Driver";
        this.age = 18;
    }
    public static void main(String[] args){
        Car swift = new Car();
//        myCar.addFuel(6);// creating  a new object
        swift.drive();
//        System.out.println( myCar.getCurrentFuelLevel());;

        Car verna = new Car();
//        verna.start();
//        verna.addFuel(6);
//        Car startedCar = verna.start();
//        startedCar.drive();
        // now benefit 1
        verna.start().drive();
        System.out.println("The cars color is "  + verna.color);
        Driver.minimumDrivingAge = 18; // static variable use
        swift = null;
        Driver driver1 = new Driver("Mukesh", 16);
        Driver driver2 = new Driver("Ramesh", 18);
//        driver2.minimumDrivingAge  can't access like this
        Driver driver3 = new Driver();
        System.out.println(driver1.name + " is legal (age = " + driver1.age + "): "  + driver1.isLegalDriver());
        System.out.println(driver2.name + " is legal (age = " + driver2.age + "): " +driver2.isLegalDriver());
        System.out.println(driver3.name + " is legal (age = " + driver3.age + "): " +driver3.isLegalDriver());

    }
}