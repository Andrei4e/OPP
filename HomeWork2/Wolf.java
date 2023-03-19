package HomeWork2;

public class Wolf extends WildAnimal{
    private boolean leader;

    public boolean GetIsCat(){
        return leader;
    }

    public Wolf(double height, double weight, String eyeColor, String habitat, String dateFound, boolean leader) {
        super(height, weight, eyeColor, habitat, dateFound);
        this.leader = leader;
    }

    @Override
    public void MakeSound(){
        System.out.println("Аууууу!" + "\n");  
    }
    
    @Override
    public void PrintInfo(){
        System.out.println("Рост - " + height + "\n" +
                            "Вес - " + weight + "\n" +
                            "Цвет глаз - " + eyeColor + "\n" +
                            "Место обитания - " + habitat + "\n" +
                            "Дата нахождения - " + dateFound + "\n" +
                            "Вожак стаи - " + leader + "\n");  
    }
}
