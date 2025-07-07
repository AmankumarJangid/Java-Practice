package Challenges.fourth;

public class Car extends Vehicle{
    @Override
    public void service() {
        System.out.println("Car is being serviced");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Vehicle c2 = new Car();
        Car c3 = (Car)c2; //valid down cast
        Vehicle c4 = new Vehicle();

        c1.service();
        c2.service();
        c3.service();
        c4.service();

        System.out.println();

        test(c1);
        test(c2);
        test(c3);
        test(c4);


    }

    public static void test( Vehicle v){
        if( v instanceof Car newCar){
            System.out.println("This is car object");
//            Car newCar = (Car)v;
            System.out.println("The downcast Class " + newCar.getClass());
            newCar.service();
        }
        else{
            System.out.println("This is vehicle object");
            v.service();
        }
    }
}
