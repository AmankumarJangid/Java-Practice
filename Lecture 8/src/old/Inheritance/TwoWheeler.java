package old.Inheritance;
import old.com.Vehicle;

public class TwoWheeler extends Vehicle {
    TwoWheeler(){
        setNumberOfTires(2);  // can't be accessed if set private old.in Vehicle class
    }

    void balance(){
        System.out.printf("I am balanced on %d wheels \n" , getNumberOfTires());
    }
}

