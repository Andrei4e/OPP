package HomeWork2;

public abstract class HomeAnimal extends Animal{
    public String nickname;
    public String breed;
    public boolean vaccinations;
    public String coatColor;
    public String DateOfBirth;

    public HomeAnimal(double height, double weight, String eyeColor, String nickname, String breed, boolean vaccinations, String coatColor, String DateOfBirth) {
        super(height, weight, eyeColor);
        this.nickname = nickname;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.DateOfBirth = DateOfBirth;
    }

    public abstract void Affection();
}
