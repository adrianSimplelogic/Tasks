package Zadanie01;

import java.util.Scanner;

public class Numbers {

    int attempts; //ilość prób
    int min; //zakres 'od' losowanej liczby
    int max; //zakres 'do' losowanej liczby

    int numberToGuess; //losowana liczba przez cpu
    int playerShoot; //próba odgadnięcia przez gracza

    int j = 0; //iterator do wyznaczania indexów w poniższej tablicy
    int[] arr = new int[j + 1]; //tablica zapisuje liczby użyte przez gracza (rośnie w trakcie)

    public Numbers(int attempts, int min, int max) {
        this.attempts = attempts;
        this.min = min;
        this.max = max;
    }

    public void numberToGuess() {
        numberToGuess = (int) (Math.random() * max) + min;
    }

    public void getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę zgadnij liczbę z zakrsu od " + min + " do " + max + ".");
        playerShoot = scanner.nextInt();
        if (playerShoot < min || playerShoot > max) {
            System.out.println("Podałeś liczbę spoza zakresu, wskaż liczbę ponownie.");
            getNumberFromUser();
        } else {
            usedOrNot();
        }
    }

    //funkcja sprawdza czy wybrana liczba była wcześniej użyta
    public void usedOrNot() {
        for (int i = 0; i < arr.length; i++) {
            if (playerShoot == arr[i]) {
                System.out.println("Tą liczbę już sprawdzałeś! Wybierz inną liczbę!");
                getNumberFromUser();
                break;
            }
        }
        arr[j] = playerShoot;
        j++;
        arrIncrease();

//        pęta na potrzeby debugowania, pokazuje tablicę archiwizującą użyte liczby
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "; ");
//        }
//        System.out.println("");
    }

    //funkcja zwiększa rozmiar tablicy którza przechowuje użyte już liczby
    public void arrIncrease() {
        int[] temporary = new int[j + 1];
        for (int i = 0; i < arr.length; i++) {
            temporary[i] = arr[i];
        }
        arr = temporary;
    }
}
