package HomeWork2;

public class Dog extends HomeAnimal{
    private boolean training;

    public boolean GetIsCat(){
        return training;
    }

    public Dog(double height, double weight, String eyeColor, String nickname, String breed, boolean vaccinations, String coatColor, String DateOfBirth, boolean training) {
        super(height, weight, eyeColor, nickname, breed, vaccinations, coatColor, DateOfBirth);
        this.training = training;
    }

    @Override
    public void MakeSound(){
        System.out.println("Гав!" + "\n");  
    }
    
    @Override
    public void PrintInfo(){
        System.out.println("Рост - " + height + "\n" +
                            "Вес - " + weight + "\n" +
                            "Цвет глаз - " + eyeColor + "\n" +
                            "Кличка - " + nickname + "\n" +
                            "Порода - " + breed + "\n" +
                            "Наличие прививок - " + vaccinations + "\n" +
                            "Цвет шерсти - " + coatColor + "\n" +
                            "Дата рождения - " + DateOfBirth + "\n" +
                            "Наличие дрессировки - " + training + "\n"); 
    }

    @Override
    public  void Affection(){
        System.out.println("Облизывает");
    }    
}
