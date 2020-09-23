import java.util.Arrays;
import java.util.Random;

public class Main3 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(div(4, 20)));

    }

    static int[] div(int size, int interval) {

        Random r = new Random();
        int[] tab = new int[size];

        for (int i = 0; i < tab.length; i++) {

            int num = r.nextInt(interval) + 1;

            if (num % 2 == 0 && num % 3 != 0) {
                tab[i] = num;
            } else {
                i--;
            }

        }
        return tab;
    }

}
