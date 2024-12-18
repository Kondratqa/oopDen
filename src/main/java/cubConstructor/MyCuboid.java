package cubConstructor;

public class MyCuboid {
    public static void main(String[] args) {
        Cuboid myCuboid = new Cuboid(12.1, 12.1, 12.1);
        double x = myCuboid.volume();
        
        System.out.println(x);        
    }
}
