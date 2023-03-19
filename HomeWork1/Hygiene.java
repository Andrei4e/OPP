package HomeWork1;

public class Hygiene extends Product{
    public int packageCount;

    public Hygiene(String name, int price, int quantity, String units, int packageCount) {
        super(name, price, quantity, units);
        this.packageCount = packageCount;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Количество штук в упаковке - " + packageCount;
    }
}
