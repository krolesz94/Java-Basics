package com.Asd0cska;

class Hamburger {

    //Beginning variable declaration
    private String breadRollType;
    private String meat;

    private boolean lettuce;
    private boolean tomato;
    private boolean cheddar;
    private boolean cucumber;

    private float baseBurgerValue;
    private float lettuceValue;
    private float tomatoValue;
    private float cheddarValue;
    private float cucumberValue;
    //End of variable declaration

    //Creating constructor
    public Hamburger(boolean lettuce, boolean tomato, boolean cheddar, boolean cucumber) {
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.cheddar = cheddar;
        this.cucumber = cucumber;
        this.breadRollType = "White bread roll";
        this.meat = "beaf";

        this.baseBurgerValue = 2.5f;
        this.lettuceValue = 0.4f;
        this.tomatoValue = 0.3f;
        this.cheddarValue = 0.7f;
        this.cucumberValue = 0.4f;
    }

    //Getter
    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCheddar() {
        return cheddar;
    }

    public boolean isCucumber() {
        return cucumber;
    }

    public float getBaseBurgerValue() {
        return baseBurgerValue;
    }

    public float getLettuceValue() {
        return lettuceValue;
    }

    public float getTomatoValue() {
        return tomatoValue;
    }

    public float getCheddarValue() {
        return cheddarValue;
    }

    public float getCucumberValue() {
        return cucumberValue;
    }

    //Summarize the whole order
    public float sum (){
        float total = baseBurgerValue;
        if (isLettuce())
            total += lettuceValue;
        if (isTomato())
            total += tomatoValue;
        if (isCheddar())
            total += cheddarValue;
        if (isCucumber())
            total += cucumberValue;

        return total;
    }
}

class HealthyBurger extends Hamburger {

    //Beginning variable declaration
    private String breadRollType;
    private boolean beanSprouts;
    private boolean cabbage;

    private float healthyBurgerValue;
    private float beanSproutsValue;
    private float cabbageValue;
    //End of variable declaration

    //Creating constructor
    public HealthyBurger(boolean lettuce, boolean tomato, boolean cheddar, boolean cucumber, boolean beanSprouts, boolean cabbage) {
        super(lettuce, tomato, cheddar, cucumber);

        this.beanSprouts = beanSprouts;
        this.cabbage = cabbage;
        this.breadRollType = "Brown rye bread roll";

        this.healthyBurgerValue = 3.2f;
        this.beanSproutsValue = 0.9f;
        this.cabbageValue = 1.2f;
    }

    //Getter
    public boolean isBeanSprouts() {
        return beanSprouts;
    }

    public boolean isCabbage() {
        return cabbage;
    }

    //Summarize the whole order for HealthyBurger
    @Override
    public float sum () {
        float total = healthyBurgerValue;
        if (isLettuce())
            total += getLettuceValue();
        if (isTomato())
            total += getTomatoValue();
        if (isCheddar())
            total += getCheddarValue();
        if (isCucumber())
            total += getCucumberValue();
        if (isBeanSprouts())
            total += beanSproutsValue;
        if (isCabbage())
            total += cabbageValue;

        return total;
    }
}

class DeluxeBurger extends Hamburger{

    //Beginning variable declaration
    private float chipsValue;
    private float drinkValue;
    //End of variable declaration

    //Creating constructor
    public DeluxeBurger(boolean lettuce, boolean tomato, boolean cheddar, boolean cucumber) {
        super(lettuce, tomato, cheddar, cucumber);

        this.chipsValue = 1.2f;
        this.drinkValue = 0.8f;
    }

    //Summarize the whole order for DeluxeBurger
    @Override
    public float sum () {
        float total = getBaseBurgerValue() + chipsValue + drinkValue;
        if (isLettuce())
            total += getLettuceValue();
        if (isTomato())
            total += getTomatoValue();
        if (isCheddar())
            total += getCheddarValue();
        if (isCucumber())
            total += getCucumberValue();

        return total;
    }
}

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(true, false, true, true);

        System.out.println("Base burger value: " + hamburger.sum());
        System.out.println("---------------------------");

        HealthyBurger healthyBurger = new HealthyBurger(true,false,true,true,true,true);

        System.out.println("Healthy burger value: " + healthyBurger.sum());
        System.out.println("---------------------------");

        DeluxeBurger deluxeBurger = new DeluxeBurger(true, false, true, true);

        System.out.println("Deluxe burger value: " + deluxeBurger.sum());
    }
}
