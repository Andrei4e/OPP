package Seminar1;

public class Food extends Product{
    public String expirDate;

    public Food(String name, int price, int quantity, String units, String expirDate) {
        super(name, price, quantity, units);
        this.expirDate = expirDate;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Срок годности - " + expirDate;
    }
}
