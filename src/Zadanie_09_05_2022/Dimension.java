package Zadanie_09_05_2022;

public class Dimension extends Producent{

    private int high;
    private int width;
    private int trankCapacity;

    public Dimension(String name, String model, int high, int width, int trankCapacity) {
        super(name, model);
        this.high = high;
        this.width = width;
        this.trankCapacity = trankCapacity;
    }
}
