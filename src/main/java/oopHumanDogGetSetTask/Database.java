package oopHumanDogGetSetTask;

public class Database {
    public int size;
    public String name;
    
    public void shutdown(){
        System.out.println("DB " + name +" shutdown");
    }
    public void load(){
        System.out.println("DB load: size " + size);

    }
    public void replicate(){
        System.out.println("DB " + name +" replicate");
    
    }
}