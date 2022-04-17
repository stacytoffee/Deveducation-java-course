package com.company;

public class Point {

    private double x;
    private double y;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString (){
        return "Point: " + this.getX() + ":" + this.getY();
    }
}
