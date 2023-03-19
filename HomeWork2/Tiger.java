package HomeWork2;

public class Tiger extends WildAnimal {
    
    
    public Tiger(double height, double weight, String eyeColor, String habitat, String dateFound) {
        super(height, weight, eyeColor, habitat, dateFound);
    }

    @Override
    public void MakeSound(){
        System.out.println("Аррр!" + "\n");  
    }
    
    @Override
    public void PrintInfo(){
        System.out.println("Рост - " + height + "\n" +
                            "Вес - " + weight + "\n" +
                            "Цвет глаз - " + eyeColor + "\n" +
                            "Место обитания - " + habitat + "\n" +
                            "Дата нахождения - " + dateFound + "\n");  
    }
}
