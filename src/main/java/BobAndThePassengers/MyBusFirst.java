package BobAndThePassengers;

public class MyBusFirst {
    public static void main(String[] args){
        Buss myBuss = new Buss(100 , 34, 217, 0, 0);

        // myBuss.setNumberSeatsBus(100);
        // myBuss.setNumberPassengersBus(10);
        // myBuss.setTheTumberOfPassengersWishingToBoardTheBus(112);
        myBuss.setExtraPassengers(0);
        myBuss.setNumberFreeSeatsBus(0);
        
        myBuss.numberSeatsBus();
        myBuss.numberPassengersBus();
        myBuss.theTumberOfPassengersWishingToBoardTheBus();        
        myBuss.numberFreeSeatsBus();
        myBuss.extraPassengers();
    }    
}
