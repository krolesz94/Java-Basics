package com.Asd0cska;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Roland<";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loaseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loaseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHitpoints());
    }
}
