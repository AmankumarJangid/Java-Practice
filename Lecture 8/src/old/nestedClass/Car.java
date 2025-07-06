package old.nestedClass;


// classes which are built with old.in an another class so that no other class and function can't use other
//then this
public class Car {
    private int noOfDoors;

    void repair(){
        Tire t = new Tire();
    }

    // so the private member of outer class  can be accessible to the nested one

    // static inner member class of the outer class can access the static member of the outer class but not the non-static member of the outer class

    protected class Tire{
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
           noOfDoors = 4;
        }
    }
}
