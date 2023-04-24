package org.example.TaskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.print("Vad är ditt namn? ");
            name = scanner.nextLine();
            if (!name.isEmpty()) {
                break;
            }
        }

        char firstLetter = Character.toUpperCase(name.charAt(0));

        if (firstLetter == 'Ö') {
            System.out.println("Namnet börjar på bokstaven Ö och det är den sista bokstaven i alfabetet!");
        } else {
            System.out.printf("Namnet börjar på bokstaven %c!\n", firstLetter);
        }
    }
}
