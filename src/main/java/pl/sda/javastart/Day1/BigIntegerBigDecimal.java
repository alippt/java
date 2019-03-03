package pl.sda.javastart.Day1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("2086666666666666666777777777765432"); //wielka liczba, można ją na sztywno przypisać

        double x = 0.02;
        double y = 0.03;
        System.out.println(x-y);

        BigDecimal xx = new BigDecimal(0.02); //niepoprawny zapis
        BigDecimal yy = new BigDecimal(0.03);
        BigDecimal xxx = BigDecimal.valueOf(0.02); //poprawny zapis
        BigDecimal yyy = BigDecimal.valueOf(0.03);
        System.out.println(xxx.subtract(yyy));
        System.out.println(xx.subtract(yy));    //metoda na odjęcie od big decimala innego big decimala (od xx -dejmujemy yy)

    }
}
