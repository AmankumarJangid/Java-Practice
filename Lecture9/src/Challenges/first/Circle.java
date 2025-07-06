package Challenges.first;

public class Circle extends Shape{

    private double radius;

    Circle(){
        this.setRadius(0);
    }

    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
