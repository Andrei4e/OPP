package HomeWork3;

public class Circle implements Figure, Lengthable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Square() {
        return Math.PI * radius * radius;
    }

    public double Length() {
        return 2 * Math.PI * radius;
    }   
    
    @Override
    public String toString(){
        return "Круг";
    }
}
