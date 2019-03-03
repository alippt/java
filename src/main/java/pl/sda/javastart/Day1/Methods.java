package pl.sda.javastart.Day1;

public class Methods {
    public static final double INCH_TO_METER_MULTIPLIER = 0.0254;
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a+b);

        printSum(a, b); // wywołuje metodę printSum zamiast pisać działanie
        printSum(a:2, b:4); //wywołuje metodę printSum dla konkretnych a i b
        int sum = returnSum(a,b); //definiuje zmienną sum która zawiera wynik metody returnSum
        System.out.println(sum);

        System.out.println(returnSum(a,b)); //drugi sposób wywołania powyższych linii
    }

    public static void printSum (int a, int b) { // ta metoda nic nie zwraca tylko wykonuje sama się
        System.out.println("efekt działania metody printSum: " + (a+b));
    }
    public static int returnSum (int a, int b){ // ta metoda wykonuje sięi podaje nam wynik swojego działania
        return a+b;
    }
    public static double inchToMeter (double inches) {
        return inches * INCH_TO_METER_MULTIPLIER;
    }
}
