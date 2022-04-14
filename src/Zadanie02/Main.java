package Zadanie02;

public class Main {

    public static void main(String[] args) {

        System.out.println("Wypełniam pierwszą tablicę losowymi liczbami:");
        int qty = 10;
        int[] arr = new int[qty];
        for (int i = 0; i < qty; i++) {
            arr[i] = randomNum();
            System.out.print(arr[i] + "; ");
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Robię kolejną tablicę i wypełniam ją 'lustrzanym odbiciem' tej pierwszej");
        int[] mirror = new int[arr.length];
        for (int i = qty - 1; i >= 0; i--) {
            mirror[i] = arr[i];
            System.out.print(mirror[i] + "; ");
        }
    }

    public static int randomNum() {
        return (int) (Math.random() * 100) + 1;
    }
}
