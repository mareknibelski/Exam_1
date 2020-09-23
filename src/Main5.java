import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        System.out.println("Pole kuli wynosi: " + ball());

    }

    static double ball() {

        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj promień r:");

        while (!scann.hasNextInt()) {
            System.out.println("To nie liczba podaj prawidłowy promień r (podaj liczbę)");
            scann.next();
        }

        int r = scann.nextInt();

        return 4 * Math.PI * Math.pow(r, 2);

    }

}
