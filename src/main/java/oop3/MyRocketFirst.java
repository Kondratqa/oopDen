package oop3;

public class MyRocketFirst {
    public static void main(String[] args) {
        
        Rocket myRocket = new Rocket();
        myRocket.name = "-Oreshnik-";
        myRocket.height = 25;
        myRocket.weight = 56;
        myRocket.diameter = 3.8;
        myRocket.fuelType = "твердотопливная";
        myRocket.flightRange = 5500;
        myRocket.flightSpeed = 12380;
        myRocket.engineStages = 3;
        myRocket.multipleWarheads = 4;
        myRocket.warheadWeight = 1500;

        myRocket.name();
        myRocket.height();
        myRocket.weight();
        myRocket.diameter();
        myRocket.fuelType();
        myRocket.flightRange();
        myRocket.flightSpeed();
        myRocket.engineStages();
        myRocket.multipleWarheads();
        myRocket.warheadWeight();
    }
    
}
