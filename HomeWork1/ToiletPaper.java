package HomeWork1;

public class ToiletPaper extends Hygiene{
    public int layersCount;

    public ToiletPaper(String name, int price, int quantity, String units, int packageCount, int layersCount) {
        super(name, price, quantity, units, packageCount);
        this.layersCount = layersCount;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Количество слоёв - " + layersCount;
    }
}
