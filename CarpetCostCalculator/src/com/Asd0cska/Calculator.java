package com.Asd0cska;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        if (floor == null){
            this.floor = new Floor(0,0);
        }else {
            this.floor = floor;
        }

        if (carpet == null){
            this.carpet = new Carpet(0);
        }else{
            this.carpet = carpet;
        }
    }

    public double getTotalCost(){
        return (floor.getArea()) * (carpet.getCost());
    }
}
