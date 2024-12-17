package BobAndThePassengers;

public class MyBusFirst {
    public static void main(String[] args){
        Buss myBuss = new Buss();

        myBuss.setNumberSeatsBus(100);
        myBuss.setNumberPassengersBus(14);
        myBuss.setTheTumberOfPassengersWishingToBoardTheBus(87);
        myBuss.setExtraPassengers(0);
        myBuss.setNumberFreeSeatsBus(0);
        
        myBuss.numberSeatsBus();
        myBuss.numberPassengersBus();
        myBuss.theTumberOfPassengersWishingToBoardTheBus();
        myBuss.extraPassengers();
        myBuss.numberFreeSeatsBus();
    }    
}
