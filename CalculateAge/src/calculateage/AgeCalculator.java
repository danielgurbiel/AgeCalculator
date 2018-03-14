package calculateage;

import java.util.Scanner;

/**
 *
 * @author Daniel Gurbiel
 */
public class AgeCalculator {
    private static Scanner input = new Scanner(System.in);
    private static String date_of_birth;

    public static void main(String[] args) {
        /*
            weeks
            days
            ... convert to seconds
        */
        System.out.print("Hello! Please insert your date of birth in format YYYY-MM-DD: ");
        date_of_birth = input.nextLine().trim();
        CalculationOfAge age_calc = new CalculationOfAge(date_of_birth);
        age_calc.showHowOld();
    }
    
}
