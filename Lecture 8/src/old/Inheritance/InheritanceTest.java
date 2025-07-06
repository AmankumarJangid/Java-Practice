package old.Inheritance;
import old.com.Vehicle;


public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        TwoWheeler two = new TwoWheeler();

        vehicle.setNumberOfTires(10);
//        two.numberOfTires = 2; no need to do this now as now I specified it old.in Two Wheeler class old.in the constructor;

        two.commute();
        vehicle.commute();
        two.balance();

        MotorCycle motor = new MotorCycle();

        motor.start();
        motor.commute();
        motor.balance();
        motor.setPetrolCapacity(20);
        System.out.println("The capacity of motorcycle is " + motor.getPetrolCapacity());
    // Object class is parent of all classes so that if any class has no parent we specified then automatically there always Oject Class as a parent of other classe

        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());
        System.out.println();

        // SO that's why if we want to make our own toString()
        // so we need use @override as if any class required to change
        // the defination of the class then we need to override it


    }
}
