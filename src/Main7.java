public class Main7 {

    public static void main(String[] args) {

        System.out.println(coutNumbers("Wynik dodawania 1 i 2 to 3"));

    }

    static int coutNumbers(String str) {

        int a = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            try {
                int num = Integer.parseInt(String.valueOf(letter));
                a += num;
            } catch (NumberFormatException e) {
                e.getMessage();
            }
        }
        return a;
    }

}
