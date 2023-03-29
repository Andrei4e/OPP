package HomeWork3;

public abstract class Polygon implements Figure, Perimeterable {
    protected double[] sides;

    protected Polygon(double[] sides){
        this.sides = sides;
    }  

    public double Perimeter(){
        double sum = 0;
        for (double side : sides)
            sum += side;
        return sum;
    }
}
