import javax.swing.*;

public class CalculatePay extends MyFrame {

    public static void askForInfo () {
        String pay;
        String hours;

        Integer w = null;
        while (true) {

            hours = JOptionPane.showInputDialog(null, "How many hours did you work? ");

            try {
                w = Integer.parseInt(hours);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter a valid hour", "error", JOptionPane.ERROR_MESSAGE);
            }
        }

        Double ww = null;
        while (true) {

            pay = JOptionPane.showInputDialog(null, "How much do you make?");

            try {
                ww = Double.parseDouble(pay);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Enter valid pay", "error", JOptionPane.ERROR_MESSAGE);
            }
        }

        double payArray[] = calculatePay(hours, pay);

        JOptionPane.showMessageDialog(null, "Your Gross Pay is $" + payArray[0] + ". Your Net Pay is $" + payArray[1]);
    }

    public static double[] calculatePay (String h, String p) {
        double grossPay;
        double netPay;
        double [] payArray = new double[2];
        int hours = Integer.parseInt(h);
        double pay = Double.parseDouble(p);

        if (hours > 40.00) {
            grossPay = ((pay * 40.00) + pay * 1.50 * (hours - 40.00));
        }
        else{
            grossPay = (pay * hours);
        }

        netPay = (grossPay * 0.75);

        payArray[0] = grossPay;
        payArray[1] = netPay;

        return payArray;
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
