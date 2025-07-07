package com.example;

public class PassByReference {

    public static void main(String[] args) {
        Point first = new Point(4, 5);
        System.out.println("first : " + first);
        move(first);
        System.out.println("first : " + first);
    }

    public static void move(Point p ){
        p.x++;
        p.y++;
        System.out.println(p);
    }


    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.y = y;
            this.x = x;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }

}

