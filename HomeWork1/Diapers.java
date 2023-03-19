package HomeWork1;

public class Diapers extends Childen{
    public int Size;
    public int minWeight;
    public int maxWeight;
    public String type;

    public Diapers(String name, int price, int quantity, String units, int minAge, boolean hypoallergenic, int Size, int minWeight, int maxWeight, String type) {
        super(name, price, quantity, units, minAge, hypoallergenic);
        this.Size = Size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Размер - " + Size + "\n" + 
                                            "Минимальный вес - " + minWeight + "\n" +
                                            "Максимальный вес - " + maxWeight + "\n" +
                                            "Тип - " + type;
    }
}
