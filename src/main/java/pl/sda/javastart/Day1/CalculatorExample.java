package pl.sda.javastart.Day1;

import java.util.Scanner;

public class CalculatorExample {
    public static void main (String [] args){ // string[] args tzn tablica stringów o nazwie args (tak się przyjęło
        Scanner scanner = new Scanner (System.in); //utworzenie obiektu typu scanner o nazwie scanner
        System.out.println("Podaj pierwszą liczbę: ");
        int firstValue = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondValue = scanner.nextInt();

        System.out.println(firstValue+secondValue);
        System.out.println(firstValue-secondValue);
        System.out.println(firstValue*secondValue);
        System.out.println(firstValue/secondValue);
        System.out.println("a+b" + (firstValue+secondValue));
        System.out.println("a-b" + (firstValue-secondValue));
        System.out.println("a*b" + (firstValue*secondValue));
        System.out.println("a/b" + (firstValue/secondValue));
        System.out.println("Max (a,b)" + Math.max(firstValue,secondValue));
        System.out.println("Pow (a.b)" + Math.pow(firstValue,secondValue));
}
}