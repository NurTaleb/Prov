package TaskSix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int poäng = 0;

        // Fråga 1
        System.out.print("1. Nämn en av rollerna som finns inom Scrum: ");
        String svar1 = input.nextLine().toLowerCase();
        if (svar1.equals("scrum master") || svar1.equals("product owner") || svar1.equals("teamledare")) {
            poäng++;
        }

        // Fråga 2
        System.out.print("2. Nämn en av ceremonierna som finns inom Scrum: ");
        String svar2 = input.nextLine().toLowerCase();
        if (svar2.equals("sprint review") || svar2.equals("sprint retrospective") || svar2.equals("daily scrum")) {
            poäng++;
        }

        // Fråga 3
        System.out.print("3. Vad är rekommenderat max antal personer i ett team? ");
        String svar3 = input.nextLine();
        if (svar3.equals("7 plus/minus 2") || svar3.equals("5 till 9")) {
            poäng++;
        }

        // Fråga 4
        System.out.print("4. Scrum har ett dokument där ALL information om Scrum finns, vad heter dokumentet? ");
        String svar4 = input.nextLine().toLowerCase();
        if (svar4.equals("scrumguiden") || svar4.equals("scrum guide")) {
            poäng++;
        }

        // Fråga 5
        System.out.print("5. Vem är den enda personen som får avbryta en Sprint? ");
        String svar5 = input.nextLine().toLowerCase();
        if (svar5.equals("product owner")) {
            poäng++;
        }

        // Räkna poäng och ge feedback
        System.out.println("Du fick " + poäng + " poäng av 5 möjliga.");
        if (poäng < 3) {
            System.out.println("Du behöver läsa på lite mer om Scrum.");
        } else if (poäng == 5) {
            System.out.println("Grattis! Du är en Scrum-mästare!");
        }

        input.close();
    }

}
