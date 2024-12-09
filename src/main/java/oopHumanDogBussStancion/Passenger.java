package oopHumanDogBussStancion;

public class Passenger {
    public String name;
    public Dog dog;

    
    public void moveToBuss(Buss buss){
        if (dog == null) {
            System.out.println(name + " заходит в автобус № " + buss.number);            
        }else{
            System.out.println(name + " заходит в автобус № " + buss.number + " с собакой породы " + dog.poroda + " " + "по кличке " + dog.nickName);
        }
    }
    public void moveFromBuss(Buss buss){
        if (dog == null) {
            System.out.println(name + " выходит из автобуса № " + buss.number);            
        }else{
            System.out.println(name + " выходит из автобуса № " + buss.number + " с собакой породы " + dog.poroda + " " + "по кличке " + dog.nickName);
        
    }
  }
}
    

    


