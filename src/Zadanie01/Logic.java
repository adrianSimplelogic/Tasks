package Zadanie01;

public class Logic {

    Numbers numbers = new Numbers(7, 1, 100);

    int numberOfTrys; //licznik prób, zmniejsza się z każdą próbą
    final int loops = numbers.attempts; //początkowa liczba prób, stała wartość

    //funkcja porównuje strzał gracza z poprawną odpowiedzą, aktualizuje liczbę prób i podpowiada
    public void check(int userNum, int cpuNum) {
        if (userNum != cpuNum) {
            numbers.attempts -= 1;
            if (userNum > cpuNum) {
                System.out.println("Podałeś za dużą liczbę.");
            } else {
                System.out.println("Podałeś za małą liczbę.");
            }
            attemptCounter(numbers.attempts);
        } else {
            win();
        }
    }

    //funkcja pilnuje odmiany rzeczownika próba-próby-prób
    public void attemptCounter(int value) {
        if (value == 1) {
            System.out.println("Pozostała Ci " + numbers.attempts + " próba.");
        } else if (value % 10 >= 2 && value % 10 <= 4 && (value % 100 < 10 || value % 100 >= 20)) {
            System.out.println("Pozostały Ci " + numbers.attempts + " próby.");
        } else if (value == 0) {
            System.out.println("Wyczerpałeś liczbę prób.");
        } else {
            System.out.println("Pozostało Ci " + numbers.attempts + " prób.");
        }
    }

    public void win() {
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||| Zgadłeś! Liczba potrzebnych prób: " + numberOfTrys + ". |||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||");
        System.exit(0);
    }

    public void lose() {
        System.out.println("Niestety nie udało Ci się zgadnąć, poprawna odpowiedź to: " + numbers.numberToGuess + ".");
    }

    //funkcja skupia inne główne funkcje i je owija w pętle
    public void gameLoop() {
        numbers.numberToGuess();
        for (int i = 1; i <= loops; i++) {
            numberOfTrys = i;
            numbers.getNumberFromUser();
            check(numbers.playerShoot, numbers.numberToGuess);
        }
        lose();
    }

}
