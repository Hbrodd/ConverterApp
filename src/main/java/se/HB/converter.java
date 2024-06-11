package se.HB;
import java.time.LocalDate;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class converter {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static double convertSekToUS(double sek) {
        return sek * 0.10;
    }

    public static double convertUsToSek(double us) {
        return us * 9.96;
    }

    public static double convertSekToEuro(double sek) {
        return sek * 0.09;
    }

    public static double convertEuroToSek(double euro) {
        return euro * 10.98;
    }

    public static void convertion(byte val) {
        if (val == 5){
            System.exit(0);
        }
        double currency = inputs.inputCurrency();
        switch (val) {
            case 1:
                df.setRoundingMode(RoundingMode.UP);
                System.out.println("You have converted " + currency + " SEK to " + df.format(converter.convertSekToUS(currency)) + " USD on " + LocalDate.now());
                break;
            case 2:
                df.setRoundingMode(RoundingMode.UP);
                System.out.println("You have converted " + currency + " USD to " + df.format(converter.convertUsToSek(currency)) + " SEK on " + LocalDate.now());
                break;
            case 3:
                df.setRoundingMode(RoundingMode.UP);
                System.out.println("You have converted " + currency + " SEK to " + df.format(converter.convertSekToEuro(currency)) + " EUR on " + LocalDate.now());
                break;
            case 4:
                df.setRoundingMode(RoundingMode.UP);
                System.out.println("You have converted " + currency + " EUR to " + df.format(converter.convertEuroToSek(currency)) + " Sek on " + LocalDate.now());
                break;
        }
    }
}