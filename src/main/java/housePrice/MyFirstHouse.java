package housePrice;

public class MyFirstHouse {
    public static void main(String[] args) {
        House myHouse = new House("123 Main St", 4, 2500);
        
        System.out.println("Адрес: " + myHouse.getAddress());
        System.out.println("Количество комнат: " + myHouse.getNumberOfRooms());
        System.out.println("Площадь: " + myHouse.getArea() + " кв. м");
        System.out.println("Стоимость дома: " + myHouse.calculatePrice() + " единиц валюты");
        
        myHouse.addRoom(2);
        System.out.println("Новое количество комнат: " + myHouse.getNumberOfRooms());
    }
}
