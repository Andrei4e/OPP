package Seminar1;

public class Bread extends Food{
    public String flourType;

    public Bread(String name, int price, int quantity, String units, String expirDate, String flourType) {
        super(name, price, quantity, units, expirDate);
        this.flourType = flourType;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Тип муки - " + flourType;
    }
}
