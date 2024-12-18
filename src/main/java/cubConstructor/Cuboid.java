package cubConstructor;
/*Бобу нужен быстрый способ вычисления объема 
кубоида с тремя значениями: длиной, 
шириной и высотой кубоида. 
Напишите функцию, которая поможет Бобу выполнить эти вычисления. */
public class Cuboid {
    private double height; // высота куба
    private double width; // ширина куба
    private double length; //длина куба
    private double volume; // объём куба
    
    
    public Cuboid(){ 

    }
    public Cuboid(double length, double width, double height){
        this.height = height;
        this.width = width;
        this.length = length;
        
        
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double newWidth){
        width = newWidth;
    }

    public double getLength(){
        return length;
    }
    public void setLenght(double newLenght){
        length = newLenght;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double newVolume){
        volume = newVolume;
    }
    
    public void volume(){
        System.out.println(height * height * length);
    }    
    
}
