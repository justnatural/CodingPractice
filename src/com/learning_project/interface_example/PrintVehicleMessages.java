package com.learning_project.interface_example;

public class PrintVehicleMessages {

    public void runVehicle(Vehicle vehicle)  {
        vehicle.run();
    }

    public void specificAction(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            ((Car) vehicle).drift();
        } else if (vehicle instanceof Boat ) {

            Boat boat = (Boat) vehicle;
            boat.sink();


            ((Boat) vehicle).sink();
        }

    }



}
