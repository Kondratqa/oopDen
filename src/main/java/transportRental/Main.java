package transportRental;

public class Main {
    public static void main(String[] args) {
        Auto myAuto = new Auto();
        myAuto.setModel("BMW");

        AutoRental myAutoRental = new AutoRental();
        myAutoRental.setRentalDey(32);
        myAutoRental.setRentalCostDey(40);
        myAutoRental.setRentalDiscount1(50);
        myAutoRental.setRentalDiscount2(20);        

        myAuto.setModel("BMW");
        myAuto.aboutModel();
        myAutoRental.calculatingCarRentalDiscount();        
    }    
}
