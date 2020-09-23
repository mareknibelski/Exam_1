public class Main2 {

    public static void main(String[] args) {

        System.out.println(shorten("Naucz się programować od podstaw", 2));

    }

    static String shorten(String str, int length) {

        return str.substring(0, length);

    }

}
