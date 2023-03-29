package HomeWork3;
public class Triangle extends Polygon {
    
    public Triangle(double a, double b, double c) {
        super(new double[]{a, b, c});
    }

    @Override
    public double Square(){
        double p = Perimeter() / 2.0;
        return Math.sqrt(p*(p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    @Override
    public String toString(){
        return "Треугольник";
    }
}
