package com.example.cmput301w22t14;

public class Square extends Shape {
    private int sideLength;
    //String color = "pink";

    public Square(int x) {
        super(x, x);
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }
}
