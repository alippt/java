package pl.sda.javastart.Day2;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println(isEven(42));

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String introduce(String name, int age, boolean male) {
        String gender;
        if (male == true) {
            gender = "mezczyzna";
        } else {
            gender = "kobieta";
        }
        String result = "Czesc, jestem" + name + " i mam" + age + "lat i jestem" + gender;

        return result;
    }

    public static String introduceWithTernary(String name, int age, boolean male) {   //druga opcja tego wyżej
        String gender = male? "mezczyzna":"kobieta";

        String result = "Czesc, jestem" + name + " i mam" + age + "lat i jestem" + gender;

        return result;
    }

    public static boolean threeParamsSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        if (a + c == b) {
            return true;
        }
        if (b + c == a) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean answerCell(boolean mum, boolean isMorning, boolean isAsleep) {  //zadanie ze slacka o telefonie od mamy
        if (isAsleep) { //jeśli spię nie odbieram
            return false;
        }
        if (isMorning && !mum) {     // jeśli jest rano a nie jest to mama nie odbieram
            return false;

        }
        return true;
    }

    public static Double switchCalculator (int a, int b, char sign){       //metoda - kalkulator
        switch (sign){
            case '+':
                return Double.valueOf(a+b);     //jedna opcja
            case '-':
                return Double.valueOf(a-b);
            case '*':
                return (double) a*b;  //druga opcja
            case'/':
                if (b==0){
                    System.out.println("nie dzieli się przez zero");
                    return null;
                }
                return (double) a/b;
            default:
                System.out.println("nie wybrałeś znaku");
                return null;
        }
    }

    public static boolean isEvenTernary (int a){
        boolean result = a%2==0?true:false;  //czy a jest podzielne przez dwa i równe 0  -1 opcja
        return result;
        //return a % 2 == 0; dopuszcalna krótsza opcja tej pierwszej
    }//metoda czy jest parzyste
}

