package Zadanie_09_05_2022;

import java.util.ArrayList;
import java.util.List;

public class Car extends Dimension {

    private Producent producent;
    private boolean isAutomaticGear;
    private String segment;
    private Dimension dimension;
    private List<Country> countriesOfSales;

    public Car(String name, String model, int high, int width, int trankCapacity, boolean isAutomaticGear, String segment) {
        super(name, model, high, width, trankCapacity);
        this.isAutomaticGear = isAutomaticGear;
        this.segment = segment;
        countriesOfSales = new ArrayList<>();
    }

    public void addCountryOfSales(Country a, Country b, Country c, Country d, Country e){
        countriesOfSales.add(a);
        countriesOfSales.add(b);
        countriesOfSales.add(c);
        countriesOfSales.add(d);
        countriesOfSales.add(e);
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public String getSegment() {
        return segment;
    }
}

