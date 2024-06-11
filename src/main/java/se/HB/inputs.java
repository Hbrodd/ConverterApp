package se.HB;
import java.util.InputMismatchException;
import java.util.Scanner;


public class inputs {

    private static Scanner scanner = new Scanner(System.in);

    public static byte val(){
        while (true) {
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.out.println("You need to input numbers and no text");
                scanner.next();
            }
        }
    }
    public static double inputCurrency(){
        while (true) {
            System.out.println("Enter a currency:");
            try {
                double currency = scanner.nextDouble();
                if(currency < 0){
                    System.out.println("You can't write a negative number try again");
                }
                else{
                    return currency;
                }
            } catch (InputMismatchException e) {
                System.out.println("You need to input numbers and no text");
                scanner.next();
            }
        }
    }

}



