package pl.sda.javastart.Day2;

public class ForsExample {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Adam");
        }
        printFewNaturalnumbers(5);  //wywołujemy metodę poniżej -wypisywanie liczb
        printFewNumbersWithoutDividableByParam(30, 3);
        printFewNumbersWithoutDividableByParamContinue(30, 3);
        printNumbersInTower(9);
        System.out.println(sumWhile(1000));
        fibonacci(23);


    }

    public static void printFewNaturalnumbers(int max) {
        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
    }

    public static void printFewNumbersWithoutDividableByParam(int max, int param) {
        for (int i = 0; i < max; i++) {
            if (i % param != 0) {    //jeśli reszta z dzielenia nie równa się 0 tzn nie podzielne przez
                System.out.println(i);
            }
        }
    }

    public static void printFewNumbersWithoutDividableByParamContinue(int max, int param) {
        for (int i = 0; i < max; i++) {
            if (i % param == 0) {    //jeśli reszta z dzielenia równa się 0 tzn jest podzielne przez
                continue;
            }
            System.out.println(i);

        }
    }

    public static int sumNaturalNumbersToLimit(int max) {   //metoda która sumuje liczby dopóki suma nie osiągnie max wartości
        int sum = 0;
        for (int i = 0; ; i++) {
            sum = sum + i;
            if (sum + i >= max) {
                break;
            }
            sum = sum + i;
        }
        return sum;
    }

    public static void printNumbersInTower(int param) {
        for (int i = 1; i <= param; i++) {     //ta petla steruje wierszami z każdą in=teracją i wzrasta o 1 wiec w kolejnym wierszu j będzie robić już 2
            for (int j = 1; j <= i; j++) {      //ta petla steruje kolumnami
                System.out.print(i);        //bez ln dodaje kolumne zamiast wiersza
            }
            System.out.println();
        }
    }

    public static int sumWhile (int max) {     //int max określa nam limit          jesli jest void wywołujemy print jeśli zwraca cos to wywołujemy sout
        int sum = 0;  //inicjujemy miejsce dla sumy
        int counter = 0;  //licznik
        while (sum +counter<= max) {
            sum = sum + (++counter);
        }
        return sum;
        }

        //uzupełnij o metodę do while
    public static int sumDoWhile (int max){
        int sum =0;
        int counter = 0;
        //zaczynamy pętlę
        do {
            sum= sum + (++counter);
        } while (sum+counter<=max);
        return sum;
    }

    public static void fibonacci (int param) {
        System.out.println("fibonacci");
        int first = 0;
        int second = 1;
        int counter = 1;

        System.out.println("0");
        System.out.println("1");
        while (counter<=param){
            int sum = first+second;
            System.out.println(sum);
            first=second;
            second=sum;
            counter++;

        }
    }

    }



