package HomeWork1;

public class Program {

    public static void main(String[] args)
    {
        Milk milk = new Milk("Молоко", 20, 3, "Штуки", 1, 4, "02.05.2023");
        Lemonade lemonade = new Lemonade("Лимонад", 12, 1, "Штуки", 1.5);
        Eggs eggs = new Eggs("Яйца", 25, 1, "Упаковка", "04.04.2023", 10);
        Mask mask = new Mask("Маска", 2, 5, "Штука", 1);
        ToiletPaper toiletPaper = new ToiletPaper("Туалетная бумага", 22, 1, "Упаковка", 6, 3);
        Diapers diapers = new Diapers("Подгузники", 40, 1, "Уаковка", 0, true, 10, 5, 15, "Для младенцев");

        PrintInfo(milk);
        System.out.println("*********************************");
        PrintInfo(lemonade);
        System.out.println("*********************************");
        PrintInfo(eggs);
        System.out.println("*********************************");
        PrintInfo(mask);
        System.out.println("*********************************");
        PrintInfo(toiletPaper);
        System.out.println("*********************************");
        PrintInfo(diapers);
    }

    public static void PrintInfo(Product product){
        System.out.println(product.toString()); 
    }
}