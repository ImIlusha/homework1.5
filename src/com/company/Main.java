package com.company;

public class Main {

    public static void main (String[] args ){
        Boss nike = new Boss(8000,600,"the defeans");
        System.out.println(" Boss.health " +  nike.getHealth() + " " + nike.getDamage() + " " + nike.getBossDeafanse ());
    }
}
