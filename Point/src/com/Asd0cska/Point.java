package com.Asd0cska;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int x = 0;
        int y = 0;

        return distance(x, y);
    }

    public double distance(int x, int y){
        int xA = this.x;
        int xB = x;
        int yA = this.y;
        int yB = y;

        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB-yA));
    }

    public double distance(Point other){
        return distance(other.x, other.y);
    }
}
