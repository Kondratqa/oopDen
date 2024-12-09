package oopHumanDogBussStancion;

public class Buss {
    
    public int number;
    public String model;
    public String beep;
    public int parkingTime;

    public void drive(){
        System.out.println("Автобус № " + number + " прибывает");
    }
    public void stop(){
        System.out.println("Автобус № " + number + " останавливается");
    }
    
    public void showInfo(){
        System.out.println("Автобус марки " + model);
        System.out.println("Автобус номер " + number);

    }
    public void parkingTime(){
        System.out.println("Время стоянки " + parkingTime + " минут");
    }
    
    public void model(String Man){
        System.out.println("Автобус марки " + model);
    }
    public void beep(){
        System.out.println("Сигналит, оповещая пвссажиров о прибытии");

    }
    
        public void stop(String stancionName){
        System.out.println("Автобус останавливается на станции " + stancionName); 
    }
 
    public void moveFrom(String stancionName){
        System.out.println("Автобус отправляется со станции " + stancionName);
    }
    public void moveTo(String stancionName){
        System.out.println("Автобус прибывает на станцию " + stancionName);
    }   
}



