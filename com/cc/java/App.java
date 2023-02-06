package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Queen queen = new Queen();
        Drone drone = new Drone();
        Worker worker = new Worker();

        pollObj(queen);
        pollObj(drone);
        pollObj(worker);
     
    }

    // Polymorphie
    private static void pollObj(HoneyBee bee){
        output(bee.doYourJob());
        output(bee.fly());
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

