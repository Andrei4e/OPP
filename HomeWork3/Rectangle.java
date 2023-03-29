package HomeWork3;

public class Rectangle extends Polygon{

    public Rectangle(double a, double b) {
        super(new double[]{a,b,a,b});
    }

    @Override
    public double Square() {
        return sides[0]*sides[1];
    }

    @Override
    public String toString(){
        return "Прямоугольник";
    }
}
