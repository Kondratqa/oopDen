package transportRental;

public class Auto {

    private String model; // модель авто

    public void setModel(String newModel){
        model = newModel;
    }
    public void aboutModel(){
        System.out.println("Марка авто " + model);
    }    
}
