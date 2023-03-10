package Seminar1;

public class Milk extends Drink{
    public float fatPercentege;
    public String beforeDate;

    public Milk(String name, int price, int quantity, String units, double volume, float fatPercentege, String beforeDate) {
        super(name, price, quantity, units, volume);
        this.fatPercentege = fatPercentege;
        this.beforeDate = beforeDate;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Процент жирности - " + fatPercentege  + "\n" +
                                            "Срок годности - " + beforeDate;
    }
}
