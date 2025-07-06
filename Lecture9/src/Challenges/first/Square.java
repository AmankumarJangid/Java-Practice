package Challenges.first;

public class Square extends Shape{
    private double side;

    Square(){
        this.setSide(0);
    }

    Square(double side){
        this.setSide(side);
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }


}
