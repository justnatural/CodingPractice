package com.learning_project.interface_example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {

    public static void main(String[] args) {

        Car car = new Car();
        Vehicle boat = new Boat();
        PrintVehicleMessages vehicleMesages = new PrintVehicleMessages();

        vehicleMesages.runVehicle(car);
        vehicleMesages.runVehicle(boat);

        car.openWindow();
        car.run();
        car.drift();
        boat.openWindow();
        boat.run();

        List<String> stringList = new LinkedList<>();
        Queue<String> stringQueue = new LinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        stringQueue.poll();
        stringList.get(0);
        linkedList.get(0);
        linkedList.poll();

    }

}
