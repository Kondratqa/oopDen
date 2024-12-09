package oopHumanDogBussStancion;

public class Main {
    public static void main(String[] args) {
        String stancion1 = "Москва";
        String stancion2 = "Королёв";       
        String stancion3 = "Мытищи";
        String stancion4 = "Щёлково";
        String stancion5 = "Ивантеевка";

        Passenger human1 = new Passenger();
        human1.name = "Андрей";

        Passenger human2 = new Passenger();
        human2.name = "Софья";
        
        Passenger human3 = new Passenger();
        human3.name = "Наталья";

        Passenger human4 = new Passenger();
        human4.name = "Сергей";

        Passenger human5 = new Passenger();
        human5.name = "Деда)";

        Sign myChar = new Sign(); // объект разделителя по станциям        

        Buss myBuss = new Buss();
        myBuss.number = 100;
        myBuss.model = "Man";
        myBuss.parkingTime = 5;

        Dog myDog = new Dog();
        myDog.nickName = "Lessi";
        human2.dog = myDog;
        myDog.poroda = "Овчарка";

        myBuss.model("Man"); // Автобус марки Man
        myBuss.beep(); // Сигналит, оповещая пвссажиров о прибытии
        myBuss.parkingTime(); // Время стоянки 5 минут
        myBuss.moveFrom(stancion1); // Автобус отправляется со станции Москва
        myChar.hyphen();        
        myBuss.moveTo(stancion2); // Автобус прибывает на станцию Королёв
        myBuss.stop(stancion2); // Автобус останавливается на станции Королёв
        myBuss.beep(); // сигналит, оповещая пвссажиров о прибытии
        myBuss.parkingTime(); // Время стоянки 5 минут
        human1.moveToBuss(myBuss); // Андрей заходит в автобус № 100
        myBuss.moveFrom(stancion2); // Автобус отправляется со станции Королёв
        myChar.hyphen();
        myBuss.moveTo(stancion3); // Автобус прибывает на станцию Мытищи
        myBuss.stop(stancion2); // Автобус останавливается на станции Мытищи
        myBuss.beep(); // сигналит, оповещая пвссажиров о прибытии
        myBuss.parkingTime(); // Время стоянки 5 минут
        human1.moveFromBuss(myBuss); // Андрей выходит из автобуса № 100
        human2.moveToBuss(myBuss); // Софья заходит в автобус № 100 с собакой породы Овчарка по кличке Lessi
        myBuss.moveFrom(stancion3); // Автобус отправляется со станции Мытищи
        myChar.hyphen();
        myBuss.moveTo(stancion4); // Автобус прибывает на станцию Щёлково
        myBuss.stop(stancion4); // Автобус останавливается на станции Щёлково
        myBuss.beep(); // сигналит, оповещая пвссажиров о прибытии
        myBuss.parkingTime(); // Время стоянки 5 минут
        human3.moveToBuss(myBuss); // Наталья заходит в автобус № 100
        human4.moveToBuss(myBuss); // Сергей заходит в автобус № 100
        human5.moveToBuss(myBuss); // Деда) заходит в автобус № 100
        myBuss.moveFrom(stancion4); // Автобус отправляется со станции Щёлково
        myChar.hyphen();
        myBuss.moveTo(stancion5); // Автобус прибывает на станцию Ивантеевка
        myBuss.stop(stancion5); // Автобус останавливается на станции Ивантеевка
        myBuss.beep(); // сигналит, оповещая пвссажиров о прибытии
        myBuss.parkingTime(); // Время стоянки 5 минут        
        human2.moveFromBuss(myBuss); // Софья выходит из автобуса № 100 с собакой породы Овчарка по кличке Lessi
        human3.moveFromBuss(myBuss); // Наталья выходит из автобуса № 100
        human4.moveFromBuss(myBuss); // Сергей выходит из автобуса № 100
        human5.moveFromBuss(myBuss); // Деда) выходит из автобуса № 100
        myBuss.moveFrom(stancion5); // Автобус отправляется со станции Ивантеевка
        myChar.hyphen();     
        
    }    
}
