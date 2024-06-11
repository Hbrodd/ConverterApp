package se.HB;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        while (true) {
            displayMeny.convertDisplay();
            while (true) {
                byte val = inputs.val();
                if (val <= 5 & val > 0) {
                    converter.convertion(val);
                    break;
                } else {
                    System.out.println("Choose a number between 1 and 5");
                }
            }
        }
    }
}