package HomeWork2;

public class Stork extends Bird {

    public Stork(double height, double weight, String eyeColor,int flightAltitude) {
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void MakeSound(){
        System.out.println("Тктктктк-тктктк-ктк-т!" + "\n");  
    }
    
    @Override
    public void PrintInfo(){
        System.out.println("Рост - " + height + "\n" +
                            "Вес - " + weight + "\n" +
                            "Цвет глаз - " + eyeColor + "\n" +
                            "Высота полета - " + flightAltitude + "\n"); 
    }    
}
