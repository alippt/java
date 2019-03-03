package pl.sda.javastart.Day2;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

//        int [] anotherTable= {2,4,6,7,8};  skrócona wersja tworzenia tablicy
        int[] anotherTable = new int[]{2, 4, 6, 7, 8};
        printElementsOfArray(anotherTable);  //wywołanie metody wypisującej zawartość tablicy
        printElementsOfArrayForEach(anotherTable);
        System.out.println(prinPrettyArray(anotherTable));
        System.out.println(Arrays.toString(anotherTable));    //odrazu wyrzuca nam zawartość tablicy do stringa


    }

    public static void printElementsOfArray(int[] tab) {     //metoda na wypisanie zawartości tablicy
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void printElementsOfArrayForEach(int[] tab) {     // 2 metoda na wypisanie zawartości tablicy
        for (int element : tab) {          //dla każdego elementu w tablicy o nazwie tab
            System.out.println(element);
        }
    }

    public static String prinPrettyArray(int[] tab) {
        String result = "[ ";
        int counter = 1;
        for (int element : tab) {
            result = result + element;
            if (counter <= tab.length - 1) {
                result = result + ",";
            }
            counter++;
        }
        return result+ "]";
    }

    public static int [] minAndMaxValue (int[]tab) {                //zwraca dwa eementy z tablicy tutaj max i min
        int min= tab[0];
        int max= tab[0];
        for (int element : tab) {
            if (min>element){
                min=element;
            }
            if (max<element){
                max= element;
            }
        }
        return new int[]{min,max};
    }
}
