package housePrice;
/*Создайте класс House, который будет представлять дом. Класс должен иметь следующие свойства:
• address (адрес дома),
• numberOfRooms (количество комнат в доме),
• area (площадь дома в квадратных метрах).

Требования:
1. Реализуйте конструктор для инициализации адреса, количества комнат и площади дома.
2. Добавьте методы get и set для каждого из свойств: address, numberOfRooms и area.
3. Реализуйте метод calculatePrice, который будет вычислять стоимость дома. Предположим, что стоимость одного 
   квадратного метра составляет 1500 единиц валюты. Метод должен возвращать общую стоимость дома на основе его площади.
4. Реализуйте метод addRoom, который будет увеличивать количество комнат на заданное число. */
public class House {
   private String address;        // Адрес дома
   private int numberOfRooms;     // Количество комнат
   private double area;           // Площадь дома в квадратных метрах

   // Конструктор для инициализации адреса, количества комнат и площади
   public House(String address, int numberOfRooms, double area) {
       this.address = address;
       this.numberOfRooms = numberOfRooms;
       this.area = area;
   }

   // Метод для получения адреса
   public String getAddress() {
       return address;
   }

   // Метод для установки адреса
   public void setAddress(String address) {
       this.address = address;
   }

   // Метод для получения количества комнат
   public int getNumberOfRooms() {
       return numberOfRooms;
   }

   // Метод для установки количества комнат
   public void setNumberOfRooms(int numberOfRooms) {
       this.numberOfRooms = numberOfRooms;
   }

   // Метод для получения площади
   public double getArea() {
       return area;
   }

   // Метод для установки площади
   public void setArea(double area) {
       this.area = area;
   }

   // Метод для вычисления стоимости дома
   public double calculatePrice() {
       final double pricePerSquareMeter = 1500; // Стоимость одного квадратного метра
       return area * pricePerSquareMeter;       // Общая стоимость дома
   }

   // Метод для добавления комнат
   public void addRoom(int roomsToAdd) {
       if (roomsToAdd > 0) {
           this.numberOfRooms += roomsToAdd; // Увеличиваем количество комнат
       } else {
           System.out.println("Количество добавляемых комнат должно быть положительным.");
       }
   }
}