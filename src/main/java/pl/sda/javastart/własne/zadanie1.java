package pl.sda.javastart.własne;

import java.time.LocalTime;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String imie = skaner.next();
        System.out.println("Czesc " + imie + " . Jak się dziś czujesz?");
        String samopoczucie = skaner.next();
        System.out.println("Ciesze się że czujesz się " + samopoczucie + " " + imie);
        System.out.println("Ile masz wzrostu " + " " + imie + "(w centymetrach)?");
        int wzrost = skaner.nextInt();
        System.out.println("Ile masz lat?");
        int wiek = skaner.nextInt();
        System.out.println(imie + ", czyli masz" + " " + wiek + " lata i" + " " + wzrost + " cm wzrostu");
        System.out.println("Swietne wymiary, jak na Twój wiek :) " + "" + imie);
        System.out.println();
        System.out.println("Jak się teraz czujesz? Nadal" + " " + samopoczucie + "?");
        String samopoczucie2 = skaner.next();
        System.out.println("Już wiem jak się czujesz i wiesz, muszę Ci coś wyznać...");
        String gender;
        if (imie.endsWith("a")) {
            gender = "Kobieta";
        } else {
            gender = "Mezczyzna";
        }
        System.out.println(gender + " " + "jak Ty, to prawdziwy skarb," + " " + imie);
        System.out.println("Dziękuję Ci za tę krótką, ale jak głęboką konwersację");

        LocalTime czasLokalny = LocalTime.now();
        int godzina = czasLokalny.getHour();
        String poraDnia = null;
        if ((godzina)>6 && godzina< 12){
            poraDnia= "ranka";
        }else if ((godzina)>=12 && godzina<= 19){
            poraDnia= "popołudnia";
        }else if ((godzina)>=19 & godzina<23){
            poraDnia= "wieczoru";
        }
        else {
            poraDnia = "snu, bo już noc";
        }
        System.out.println("Spookojnego" + " " + poraDnia);
        System.out.println("PS. Jeśli podasz mi ile wazysz, to powiem Ci coś jeszcze");

    }
}
