package oopGetSet1;

public class MyRocketFirstGetSet {
    public static void main(String[] args) {
        
        RocketGetSet myRocket = new RocketGetSet();
        myRocket.setName("-Oreshnik-");
        myRocket.setHeight(25);
        myRocket.setWeight(56);
        myRocket.setDeameter(3.8);
        myRocket.setFuelTape("твердотопливная");
        myRocket.setFlightRange(5500);
        myRocket.setFlightSpeed(12380);
        myRocket.setEngineStages(3);
        myRocket.setMultipleWarheads(4);
        myRocket.setWarheadWeight(1500);

        // вывод метода
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
