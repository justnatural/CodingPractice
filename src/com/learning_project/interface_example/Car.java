package com.learning_project.interface_example;

public class Car implements Vehicle{

    public void run() {
        System.out.println("Car runs");
    }

    public void openWindow() {
        System.out.println("Car window is open");
    }

    public void drift() {
        System.out.println("Car is drifting");
    }

}
