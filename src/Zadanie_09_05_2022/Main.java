package Zadanie_09_05_2022;

public class Main {

    public static void main(String[] args) {

        Country anglia = new Country("Anglia", 'A');
        Country belgia = new Country("Belgia", 'B');
        Country chiny = new Country("Chiny", 'C');
        Country dania = new Country("Dania", 'D');
        Country estonia = new Country("Estonia", 'E');
        Country finlandia = new Country("Finlandia", 'F');
        Country grecja = new Country("Grecja", 'G');
        Country holandia = new Country("Holandia", 'H');
        Country indie = new Country("Indie", 'I');
        Country japonia = new Country("Japonia", 'J');
        Country kanada = new Country("Kanada", 'K');
        Country luksemburg = new Country("Luksemburg", 'L');
        Country meksyk = new Country("Meksyk", 'M');
        Country niemcy = new Country("Niemcy", 'N');
        Country oman = new Country("Oman", 'O');
        Country polska = new Country("Polska", 'P');

        Factory factory = new Factory();

        Car car01 = new Car("FSO","fiat 126p",2,2,100,false,"premium");
        car01.addCountryOfSales(polska,japonia,oman,indie,belgia);
        factory.addCar(car01);

        Car car02 = new Car("dacia","duster",2,2,150,false,"standard");
        car02.addCountryOfSales(indie,niemcy,polska,belgia,grecja);
        factory.addCar(car02);

        Car car03 = new Car("suzuki","vitara",2,2,150,false,"standard");
        car03.addCountryOfSales(japonia,chiny,finlandia,estonia,dania);
        factory.addCar(car03);

        Car car04 = new Car("cadillac","srx", 2,2,200, true,"medium");
        car04.addCountryOfSales(anglia,kanada,meksyk,luksemburg,holandia);
        factory.addCar(car04);

        Car car05 = new Car("volkswagen","golf",2,2,100,true,"medium");
        car05.addCountryOfSales(niemcy,polska,dania,belgia,luksemburg);
        factory.addCar(car04);

        factory.printAllData();
    }

}
