package old.com;



// old.in java multiple inheritance is not possible
//its possible old.in c++
// its not java because if there is two classes which are parent to a single class
//then if both parent classes contain same funciton named
//so this is called a diamond problem


public class Vehicle {
//    public int numberOfTires;
    private int numberOfTires; // If i do this then Two Wheeler and child classes can't access

    public void setNumberOfTires( int tires){ // mostly always use getter and setter so that we can change it but not directly
        numberOfTires = tires;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void commute(){
        System.out.printf("This is vehicle have %d tires\n" , numberOfTires );
    }
}


