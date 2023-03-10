package Seminar1;

public class Childen extends Product{
    public int minAge;
    public boolean hypoallergenic;

    public Childen(String name, int price, int quantity, String units, int minAge, boolean hypoallergenic) {
        super(name, price, quantity, units);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString(){
        return super.toString() + "\n"  + "Минимальный возраст - " + minAge + "\n" +
                                            "Гипоаллергенность - " + hypoallergenic;
    }
}
