package HomeWork2;

public class Cat extends HomeAnimal {
    private boolean isCoat;

    public boolean GetIsCat(){
        return isCoat;
    }

    public Cat(double height, double weight, String eyeColor, String nickname, String breed, boolean vaccinations, String coatColor, String DateOfBirth, boolean isCoat) {
        super(height, weight, eyeColor, nickname, breed, vaccinations, coatColor, DateOfBirth);
        this.isCoat = isCoat;
    }

    @Override
    public void MakeSound(){
        System.out.println("Мяу!" + "\n");  
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
                            "Наличие шерсти - " + isCoat + "\n"); 
    }

    @Override
    public  void Affection(){
        System.out.println("Трется о ноги");
    }
}
