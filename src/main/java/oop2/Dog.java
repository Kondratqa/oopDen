package oop2;

public class Dog {
    private String breed; // порода
    private String nickname; // кличка
    private double weight; // вес
    private int paws; // лапы
    private String coatСolor; // цвет шерсти

    public String getBreed(){
        return breed;
    }
    public void setBreed(String newBreed){
        breed = newBreed;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String newNickname){
        nickname = newNickname;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double newWeight){
        if (newWeight > 0) {
           weight = newWeight; 
        }else{
            System.out.println("Вес собаки " + newWeight + " не может быть отрицательным");
        }
            
    }
    public int getPaws(){
        return paws;
    }
    public void setPaws(int newPaws){
        paws = newPaws;
    }
    public String getCoatСolor(){
        return coatСolor;
    }
    public void setCoatСolor(String newCoatСolor){
        coatСolor =newCoatСolor;
    }

    public void breed(){

    System.out.println("Моя собака породы " + breed);
}
public void nickname(){

    System.out.println("Кличка моего пёсика " + nickname);
}
public void weight(){

    System.out.println("Весит моя собака " + weight + " кг");
}
public void paws(){

    System.out.println("У неё " + paws + " лапы");
}
public void coatСolor(){

    System.out.println("И " + coatСolor + " густая шерсть");
    
    }
}