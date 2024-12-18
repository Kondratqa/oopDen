package BobAndThePassengersSeparator;
/* Боб работает водителем автобуса. Однако он стал чрезвычайно популярен среди жителей города. 
При таком количестве пассажиров, желающих сесть в его автобус, ему иногда приходится сталкиваться 
с проблемой нехватки места в автобусе! Он хочет, чтобы вы написали простую программу, сообщающую ему, 
сможет ли он вместить всех пассажиров.

Обзор задачи:
Вам нужно написать функцию, которая принимает три параметра:

cap — количество людей, которых может вместить автобус, не считая водителя.
on — количество людей в автобусе, не считая водителя.
wait — количество людей, ожидающих посадки в автобус, не считая водителя.
Если места достаточно, верните 0, а если нет, верните количество пассажиров, которых он не может взять.*/
public class Buss {    
    private int numberSeatsBus; // количество мест в автобусе 100
    private int numberPassengersBus; // количество пассажиров в автобусе 14
    private int theTumberOfPassengersWishingToBoardTheBus; // количество пассажиров которое ожидает посадки в автобус 147
    private int extraPassengers; // = theTumberOfPassengersWishingToBoardTheBus - numberSeatsBus; // лишние пассажиры
    private int numberFreeSeatsBus; // = numberSeatsBus - numberPassengersBus; // количество свободных мест в автобусе 
    

    public Buss(){
    }
    
    public Buss(int numberSeatsBus, int numberPassengersBus, int theTumberOfPassengersWishingToBoardTheBus, int extraPassengers, int numberFreeSeatsBus){        
        this.numberSeatsBus = numberSeatsBus; // количество пассажиров в автобусе 14
        this.numberPassengersBus = numberPassengersBus; // количество мест в автобусе 100        
        this.theTumberOfPassengersWishingToBoardTheBus = theTumberOfPassengersWishingToBoardTheBus; // количество пассажиров которое ожидает посадки в автобус 147       
        // this.extraPassengers = extraPassengers; // лишние пассажиры
        // this.numberFreeSeatsBus = numberFreeSeatsBus; // количество свободных мест в автобусе
    }

    public int getNumberSeatsBus(){
        return numberSeatsBus;
    }
    public void setNumberSeatsBus(int newNumberSeatsBus){      
        numberSeatsBus = newNumberSeatsBus;
    }
    //-----------------------------------------------------------------------    
    
    public int getNumberPassengersBus(){
        return numberPassengersBus;
    }
    public void setNumberPassengersBus(int newNumberPassengersBus){
        numberPassengersBus = newNumberPassengersBus;
    }
    //-----------------------------------------------------------------------    
    
    public int getTheTumberOfPassengersWishingToBoardTheBus(){
        return theTumberOfPassengersWishingToBoardTheBus;
    }
    public void setTheTumberOfPassengersWishingToBoardTheBus(int newTheTumberOfPassengersWishingToBoardTheBus){
        theTumberOfPassengersWishingToBoardTheBus = newTheTumberOfPassengersWishingToBoardTheBus;
    }
    //-----------------------------------------------------------------------
    public int getExtraPassengers(){
        return extraPassengers;
    }
    public void setExtraPassengers(int newExtraPassengers){
        extraPassengers = newExtraPassengers;
    }
    //-----------------------------------------------------------------------
    public int getNumberFreeSeatsBus(){
        return numberFreeSeatsBus;
    }
    public void setNumberFreeSeatsBus(int newNumberFreeSeatsBus){
        numberFreeSeatsBus = newNumberFreeSeatsBus;
        numberFreeSeatsBus = numberSeatsBus - numberPassengersBus;
    }
    //-----------------------------------------------------------------------
    
    public void numberSeatsBus(){
        System.out.println("Общее количество мест в автобусе " + numberSeatsBus);
    }
    public void numberPassengersBus(){
        System.out.println("Количество занятых мест в автобусе пассажирами " + numberPassengersBus);
    }
    public void theTumberOfPassengersWishingToBoardTheBus(){
        System.out.println("Ожидают посадки на станции " + theTumberOfPassengersWishingToBoardTheBus + " человек");
    }
    public void extraPassengers(){
        System.out.println("Лишние пассажиры которых не может вместить автобус " + (theTumberOfPassengersWishingToBoardTheBus - numberFreeSeatsBus));
    }
    public void numberFreeSeatsBus(){
        System.out.println("Свободные места в автобусе " + numberFreeSeatsBus);
    }
    
}
