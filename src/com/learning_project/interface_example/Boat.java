package com.learning_project.interface_example;

public class Boat implements Vehicle{

    public void run() {
        System.out.println("Boat runs");
    }

    public void openWindow() {
        System.out.println("Boat window is open");
    }

    public void sink() {
        System.out.println("Boat is sinking");
    }

}
