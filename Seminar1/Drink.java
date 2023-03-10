package Seminar1;

public class Drink extends Product{
    public double volume;

    public Drink(String name, int price, int quantity, String units, double volume) {
        super(name, price, quantity, units);
        this.volume = volume;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Объём - " + volume;
    }
}
