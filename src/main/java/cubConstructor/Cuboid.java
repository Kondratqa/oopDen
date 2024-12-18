package cubConstructor;
/*Бобу нужен быстрый способ вычисления объема 
кубоида с тремя значениями: длиной, 
шириной и высотой кубоида. 
Напишите функцию, которая поможет Бобу выполнить эти вычисления. */
public class Cuboid {
    private double height; // высота куба
    private double width; // ширина куба
    private double length; //длина куба    
    
    public Cuboid(double length, double width, double height){
        this.height = height;
        this.width = width;
        this.length = length;  
    }    
    public double volume(){
        return height * width * length;
    }   
}
