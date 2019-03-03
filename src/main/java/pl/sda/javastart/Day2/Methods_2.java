package pl.sda.javastart.Day2;

public class Methods_2 {
    public static void main(String[] args) {
        String someText = "8.9";            //jkais string czyli napis
         //wywołujemy nasza metodę która zamieni liczbę z napisu na typ liczbowy
        System.out.println(ApplicationUtils.convertToDouble(someText));
        someText = someText + " ";
        System.out.println(ApplicationUtils.convertToDouble(someText));
        someText = null;
        System.out.println(ApplicationUtils.convertToDoubleObject(someText));
           //uzupełnij introduce
    }
}
