import java.util.Arrays;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(returnTab()));

    }

    static int[] returnTab() {

        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj parametr n:");

        while (!scann.hasNextInt()) {
            System.out.println("Podaj prawidłowy parametr (ilu elementowa ma być tablica, wpisz liczbę:)");
            scann.next();
        }

        int n = scann.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + 1;
        }

        return tab;

    }

}
