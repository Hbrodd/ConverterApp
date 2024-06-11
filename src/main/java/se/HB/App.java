package se.HB;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        while (true) {
            displayMeny.convertDisplay();
            byte val = inputs.val();
            if (val <= 5 & val > 0) {
                switch (val) {
                    case 1:
                        System.out.println(converter.convertSekToUS(inputs.inputCurrency()));
                        break;
                    case 2:
                        System.out.println(converter.convertUsToSek(inputs.inputCurrency()));
                        break;
                    case 3:
                        System.out.println(converter.convertSekToEuro(inputs.inputCurrency()));
                        break;
                    case 4:
                        System.out.println(converter.convertEuroToSek(inputs.inputCurrency()));
                        break;
                    case 5:
                        System.exit(0);
                }
            } else {
                System.out.println("Choose a number between 1 and 5");
            }
        }
    }
}