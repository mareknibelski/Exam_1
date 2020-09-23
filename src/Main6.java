public class Main6 {

    public static void main(String[] args) {

        System.out.println(replaceStr("Ale dziś ładna pogoda", "a", "b"));

    }

    static String replaceStr(String str, String forReplace, String replacement) {

        return str.replaceAll(forReplace, replacement);

    }

}
