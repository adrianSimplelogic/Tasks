package Zadanie_09_05_2022;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<Car> cars;

    public Factory() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void printAllData(){
        System.out.println();
    }

}
