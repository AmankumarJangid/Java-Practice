package com.example.geometry;

public class Rectangle {
    private double length;
    private double width;


    public Rectangle setDimension( double length ,double width){
        try{
        if( length <= 0 || width <= 0){
            throw new IllegalArgumentException(String.format( " At Object %s : length and width should be an positive and non zero ", this.getClass().getName()));
        }
            this.length = length;
            this.width = width;
        }

        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return this;
    }

    public double getArea(){
        return length*width;
    }

    public static void main(String[] args) {
        System.out.println(new Rectangle().setDimension(50, 25).getArea());
    }
}
