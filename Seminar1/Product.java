package Seminar1;

public class Product
{
    public String name;
    public int price;
    public int quantity;
    public String units;

    public Product(String name, int price, int quantity, String units) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.units = units;
    }

    @Override
    public String toString(){
        return "Название - " + name + "\n" +
                "Цена - " + price + "\n" +
                "Количество - " + quantity + "\n" +
                "Единица измерения - " + units;
    }
}


