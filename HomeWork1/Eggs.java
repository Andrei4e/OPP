package HomeWork1;

public class Eggs extends Food{
    public int packageCount;

    public Eggs(String name, int price, int quantity, String units, String expirDate, int packageCount) {
        super(name, price, quantity, units, expirDate);
        this.packageCount = packageCount;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Количество в упаковке - " + packageCount;
    }
}
