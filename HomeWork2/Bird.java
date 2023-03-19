package HomeWork2;

public abstract class Bird extends Animal {
    int flightAltitude;

    protected Bird(double height, double weight, String eyeColor,int flightAltitude) {
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }

    public void Fly(){
        System.out.println(String.format("Я лечу на %d метрах", flightAltitude + "\n"));
    }
}

