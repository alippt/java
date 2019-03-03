package pl.sda.javastart.Day2;

public class ApplicationUtils {
    public static double convertToDouble (String text){
        return Double.parseDouble(text); //zwraca doubla ze stringa
    }

    public static Double convertToDoubleObject (String text){
        if (text==null){
            return null;
        }else
        return Double.valueOf (text);   //zwraca Double ale jako objekt a nie prosty typ double
    }
}
