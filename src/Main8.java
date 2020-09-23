

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main8 {

    public static void main(String[] args) {

        create(20);

    }

    static void create(int max) {

        Scanner scann = new Scanner(System.in);
        Path path = Paths.get("src/exam.txt");
        Path path1 = Paths.get("src/exam_passed.txt");
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        String login = "";

        System.out.println("Podaj liczbę osób w grupie");

        while (!scann.hasNextInt()) {
            System.out.println("To nie jest liczba, proszę podaj prawidłową liczbę osób w grupie");
            scann.next();
        }

        int n = scann.nextInt();

        try {

            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            while (i < n) {
                System.out.println("Podaj login:");
                while (scann.nextLine().equals(login)) {
                    login = scann.next();
                }

                System.out.println("Podaj ilość punktów:");
                while (!scann.hasNextInt()) {
                    System.out.println("To nie są punkty, proszę podaj prawidłową ilośc punktów");
                    scann.next();
                }
                int point = scann.nextInt();

                list.add(login + " " + point);

                login = "";
                i++;
            }

            try {
                Files.write(path, list);
            } catch (IOException ex) {
                System.out.println("Błąd zapisu do pliku");
            }

        } catch (IOException e) {
            System.out.println("Błąd przy tworzeniu pliku");
        }

        ArrayList<String> out = new ArrayList<>();

        try {
            if (!Files.exists(path1)) {
                Files.createFile(path1);
            }

            try {
                Scanner scann1 = new Scanner(path);

                while (scann1.hasNextLine()) {
                    String text = scann1.nextLine();
                    String[] parts = text.split(" ");
                    int point = Integer.parseInt(parts[1]);
                    if (point >= max * 0.6) {
                        out.add(text);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Files.write(path1, out);
            } catch (IOException ex) {
                System.out.println("Błąd zapisu");
            }
        } catch (IOException e) {
            System.out.println("Błąd przy tworzeniu pliku");
        }

    }

}
