package oopGetSet1;

public class RocketGetSet {
    /*Использование модификатора доступа public для переменных класса это не правильно 
    и не желательно, потомучто такой подход нарушает безопасность объекта, 
    любой кто использует ваш объект, может изменить свойства объекта!
    Наприер: такие свойства объекта как - вес,высота,дальность полёта и т.д не могут 
    быть отрицательными, по этому модификатор private не дает изменить свойства объекта 
    в отличии от модификатора public!
    Вывод: от состояния объекта (значений переменных класса) зависит правильная раьота объекта
           задача програмиста - обеспечить бнзопасность изменения состояния объекта (безопасность 
           изменения переменных класса)
    Для защиты доступа к переменным класса был придуман механизм доступа к переменным класса 
    get(получить значения) и set(записать значения). В коде get и set представляют собой 
    обычные методы, имя метода начинается с префикса get  или set, например для переменной 
    name , будут методы getName и setName, таким образом мы обеспечиваем безопасность на записть
    значения переменной и на получение переменной*/
    
    private String name; /* имя ракеты -  ставим модифкатор private вместо public, теперь доступ 
    к переменной из вне класса закрыт.*/    
    private double height; // высота
    private double weight; // вес
    private double diameter; // диаметр
    private String fuelType; // тип топлива
    private int flightRange; // дальность полёта
    private int flightSpeed; // скорость полета
    private int engineStages; // ступени двигателя
    private int multipleWarheads; // разделяющееся боевые блоки
    private int warheadWeight; // Вес боевой части

    public String getName(){ /*организуем доступ к переменной через get и set - доступ 
        к перемнной теперь доступен только внутри класса и во всех методах этого класса, 
        по этому внутри метода getName переменная name нам доступна напрямую*/
        return name;
    }
    public void setName(String newName){ /*set имеет модификатор public, тип метода будет void, 
        так как метод ничего не возвращает, пишем префикc set к переменной name(setName), 
        передаем параметры в setName, которы совпадаю с типом переменной name, в данном 
        случае setName(String newName)*/
       
        name = newName; /*далее внутри метода присваеваем переменной name новое имя newName */
    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        if (newHeight > 0) { /*защитим наши значения переменной с помощью условия и операторов if и else
            от отрицательных значений, например высота не может быть отрицательной, в данном случае 
            мы проверяем условием, является ли значения newHeight корректным */
            height = newHeight; /*таким образом если значение newHeight > 0 то присваеваем значению 
            height значение newHeight*/           
        }else{ // иначе выводим сообщение "Переданное значения " + newHeight + " не может быть отрицательным"
            System.out.println("Переданное значения " + newHeight + " не может быть отрицательным");
        }        
    }
    
    public double getWeight(){
        return weight;
    }
    public void setWeight(double newWeight){
        if (newWeight > 0) {
            weight = newWeight;            
        }else{
            System.out.println("Переданное значения " + newWeight + " не может быть отрицательным");
        }        
    }
    
    public double getDiameter(){
        return diameter;
    }
    public void setDeameter(double newDeameter){
        if (newDeameter > 0) {
            diameter = newDeameter;
        }else{
            System.out.println("Переданное значения " + newDeameter + " не может быть отрицательным");
        }        
    }

    public String getFuelTape(){
        return fuelType;
    }
    public void setFuelTape(String newFuelTape){
        fuelType = newFuelTape;    
    }
    
    public int getFlightRange(){
        return flightRange;
    }
    public void setFlightRange(int newFlightRange){
        if (newFlightRange > 0) {
            flightRange = newFlightRange;
        }else{
            System.out.println("Переданное значения " + newFlightRange + " не может быть отрицательным");
        }        
    }

    public int getFlightSpeed(){
        return flightSpeed;
    }
    public void setFlightSpeed(int newFlightSpeed){
        if (newFlightSpeed > 0) {
            flightSpeed = newFlightSpeed;
        }else{
            System.out.println("Переданное значения " + newFlightSpeed + " не может быть отрицательным");
        }        
    }

    public int getEngineStages(){
        return engineStages;
    }    
    public void setEngineStages(int newEngineStages){
        if (newEngineStages > 0) {
            engineStages = newEngineStages;
        }else{
            System.out.println("Переданное значения " + newEngineStages + " не может быть отрицательным");
        }        
    }
    
    public int getMultipleWarheads(){
        return multipleWarheads;
    }
    protected void setMultipleWarheads(int newMultipleWarheads){
        if (newMultipleWarheads > 0) {
            multipleWarheads =newMultipleWarheads;
        }else{
           System.out.println("Переданное значения " + newMultipleWarheads + " не может быть отрицательным"); 
        }
    }
    
    public int getWarheadWeight(){
        return warheadWeight;
    }
    public void setWarheadWeight(int newWarheadWeight){
        if (newWarheadWeight > 0) {
            warheadWeight = newWarheadWeight;
        }else{
            System.out.println("Мы снимаем боевую часть " + newWarheadWeight + " и ставим ядерный заряд, пизда всем");
        }        
    }

    
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