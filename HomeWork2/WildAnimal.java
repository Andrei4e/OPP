package HomeWork2;

public abstract class WildAnimal extends Animal{
    public String habitat;
    public String dateFound;

    public WildAnimal(double height, double weight, String eyeColor, String habitat, String dateFound) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.dateFound = dateFound;
    }
}
