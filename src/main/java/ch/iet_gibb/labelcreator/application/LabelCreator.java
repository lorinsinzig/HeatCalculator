package ch.iet_gibb.labelcreator.application;

import  java.util.Scanner;

public class LabelCreator {

    public static void main(String[] args) {
        double kWh;
        String einheit;
        String holzart;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Art der Heizung ein: ");
        String heizungArt = scanner.nextLine();

        switch (heizungArt) {
            case "Holzheizung":
                System.out.println("Bitte geben Sie die Menge an kWh an:");
                kWh = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Bitte geben Sie die Einheit an:");
                einheit = scanner.nextLine();

                System.out.println("Bitte geben Sie die Holzart an:");
                holzart = scanner.nextLine();

                Holzheizung holzheizung = new Holzheizung(kWh, einheit, holzart);
            case "Schnitzelheizung":
                System.out.println("Bitte geben Sie die Menge an kWh an:");
                kWh = scanner.nextInt();

                System.out.println("Bitte geben Sie die Einheit an:");
                einheit = scanner.nextLine();

                System.out.println("Bitte geben Sie die Holzart an:");
                holzart = scanner.nextLine();

                Schnitzelheizung schnitzelheizung = new Schnitzelheizung(kWh, einheit, holzart);
            case "Pelletheizung":
                System.out.println("Bitte geben Sie die Menge an kWh an:");
                kWh = scanner.nextInt();

                System.out.println("Bitte geben Sie die Einheit an:");
                einheit = scanner.nextLine();

                Pelletheizung pelletheizung = new Pelletheizung(kWh, einheit);
            default:
                System.out.println("Diese Heizungsart ist nicht bekannt.");
        }
    }
}