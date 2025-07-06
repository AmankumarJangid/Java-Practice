package old.Aman;

import old.com.GetterSetter.Car;
//import old.com.org.Default;

public class DefaultTest {
    public static void main(String[] args) {
        Car car1 = new Car("Black" , "Scorpio", 10.4, 1899000);
//        here it can't be used old.in the another package other than where the class created old.in /
//        System.out.println(car1.costOfPurchase);
        System.out.printf("%s, %s\n",car1.getColor() , car1.getFuel());
        car1.setColor("Yellow");
        car1.setColor("Blue");
        System.out.println(car1.getColor());
//    here it can't be used as Default class is classified as default class;
//        old.com.org.Default def = new Default();
    }
}
