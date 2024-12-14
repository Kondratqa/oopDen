package transportRental;

public class Main {
    public static void main(String[] args) {
        Auto myAuto = new Auto();
        myAuto.model = "BMW";

        AutoRental myAutoRental = new AutoRental();
        myAutoRental.rentalDey = 1;
        myAutoRental.rentalCostDey = 40;
        myAutoRental.rentalDiscount1 = 50;
        myAutoRental.rentalDiscount2 = 20;        

        myAuto.model();
        myAutoRental.calculatingCarRentalDiscount();        
    }    
}
