package Zadanie01;

public class GuessTheNumber {


    public static void main(String[] args) {
        Logic logic = new Logic();

        System.out.println("\nKoputer wylosował liczbę którą musisz odnaleźć. Ilość prób: " + logic.loops + ".\n");
        logic.gameLoop();

    }


}
