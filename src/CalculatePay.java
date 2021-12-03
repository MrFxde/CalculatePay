import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatePay {
    public static void main(String[] args) {
        //code which user inputs how many hours they worked, how much they make,
        //then outputs their gross pay and after taces which would be * .75

        Scanner myObj = new Scanner(System.in);

        //ask user for how many hours they worked this week, save as a integer
        System.out.println("How many hours did you work?  ");

        boolean validInput = false;
        int hours = 0;

        //if user inputs string etc, it will prompt user for integer
        while(!validInput) {
            try {
                hours = myObj.nextInt();
                if (hours >= 0)
                validInput = true;
                else
                    System.err.println("Please enter positive number");
            }

            catch(InputMismatchException e) {
                System.err.println("Please enter whole numbers");
                myObj.next();
            }
        }

        //ask how much they make
        System.out.println("How much do you make per hour?:  ");

        boolean validInput1 = false;
        double pay = 0;

        while(!validInput1) {
            try {
                pay = myObj.nextDouble();
                if (pay >= 0)
                validInput1 = true;
                else
                    System.err.println("Please enter positive number");

            } catch(InputMismatchException e) {
                System.err.println("Please enter valid format");
                myObj.next();
            }
        }

        //calculate pay
        double grossPay;
        double netPay;

        if (hours > 40.00) {
            grossPay = ((pay * 40.00) + pay * 1.50 * (hours - 40.00));
        }
        else{
            grossPay = (pay * hours);
        }

        netPay = (grossPay * 0.75);

        //print results
        System.out.printf("Your Gross Pay per week is $" + "%.2f" + "\n" ,grossPay);
        System.out.printf("Your Net Pay is around $" + "%.2f" + " per week!" + "\n", netPay);

    }
}
