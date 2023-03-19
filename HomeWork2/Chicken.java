package HomeWork2;

public class Chicken extends Bird {

    public Chicken(double height, double weight, String eyeColor,int flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void MakeSound(){
        System.out.println("Ко-ко-ко!" + "\n");  
    }
    
    @Override
    public void PrintInfo(){
        System.out.println("Рост - " + height + "\n" +
                            "Вес - " + weight + "\n" +
                            "Цвет глаз - " + eyeColor + "\n" +
                            "Высота полета - " + flightAltitude + "\n"); 
    }  
}
