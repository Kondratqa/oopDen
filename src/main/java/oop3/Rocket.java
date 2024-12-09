package oop3;

public class Rocket {
    public String name; // имя ракеты   
    public double height; // высота
    public double weight; // вес
    public double diameter; // диаметр
    public String fuelType; // тип топлива
    public int flightRange; // дальность полёта
    public int flightSpeed; // скорость полета
    public int engineStages; // ступени двигателя
    public int multipleWarheads; // разделяющееся боевые блоки
    public int warheadWeight; // Вес боевой части

    
    
    public void name(){
        System.out.println("Наименование ракеты " + name);
    }
    public void height(){
        System.out.println("Высота " + height + " метров");
    }
    public void weight(){
        System.out.println("Вес " + weight + " тонн");
    }
    public void diameter(){
        System.out.println("Диаметр " + diameter + " метра");
    }
    public void fuelType(){
        System.out.println("Тип топлива " + fuelType);
    }
    public void flightRange(){
        System.out.println("Дальность полёта " + flightRange + " км");
    }
    public void flightSpeed(){
        System.out.println("Скорость полёта " + flightSpeed + " км/ч");
    }
    public void engineStages(){
        System.out.println("Ступени двигателя " + engineStages);
    }
    public void multipleWarheads(){
        System.out.println("Число боевых блоков " + multipleWarheads);
    }
    public void warheadWeight(){
        System.out.println("Вес боевой части " + warheadWeight + " тонны ВСЕ В АХУЕ");
    }
        
}
