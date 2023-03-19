package HomeWork2;

public abstract class Animal {
    public double height;
    public double weight;
    public String eyeColor;

    public Animal(double height, double weight, String eyeColor) {
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    protected abstract void MakeSound();
    
    protected abstract void PrintInfo();
}
