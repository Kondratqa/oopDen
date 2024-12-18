package BobAndThePassengersSeparator;

public class MyBusFirst {
    public static void main(String[] args){
        Buss myBuss = new Buss(100 , 13, 311);                
        myBuss.calcNumberFreeSeatsBus();        
        
        hyphen1();
        myBuss.numberSeatsBus();
        hyphen1();
        myBuss.numberPassengersBus();
        hyphen1();
        myBuss.theTumberOfPassengersWishingToBoardTheBus();
        hyphen1();        
        myBuss.numberFreeSeatsBus();
        hyphen1();
        myBuss.extraPassengers();
        hyphen1();
    }
    public static void hyphen1(){
        System.out.println("=====================================================================");
    }
}    

