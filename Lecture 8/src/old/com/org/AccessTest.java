package old.com.org;

public class AccessTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.color = "Green";
        car.model = "BMW";
//        private access modifier is used with costOfPurchase
//        car.costOfPurchase = 100000;

        System.out.println(car);
        Car newCar = new Car("Red" , "Audi" , 10.5, 102300);
        System.out.println(newCar);
        // default access modified variable can be used directly old.in the directory package itself
        System.out.println(newCar.costOfPurchase);
        // it can be used directly here but can't be used my class other than this package

        Default def = new Default();
    }
}
