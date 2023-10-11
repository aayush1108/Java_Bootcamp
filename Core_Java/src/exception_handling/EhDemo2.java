package exception_handling;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EhDemo2 {
    static int initialAmountInRec = 0;
    static int initialAmountSend = 100;
    static int amountTobeTransferred = 50;

    public static void main(String[] args) {
        if(initialAmountSend >= amountTobeTransferred){

            try {
                initialAmountSend = initialAmountSend - amountTobeTransferred;
                System.out.println(5/0);
                initialAmountInRec = amountTobeTransferred;
            } catch(Exception ex){
                System.out.println("Server is down. Please try again later. If amount is deducted then it will " +
                        "refund in 3-4 days.");
                initialAmountSend = initialAmountSend + amountTobeTransferred;
                initialAmountInRec = 0;
            }

        }
        else {
            System.out.println("Not enough balance");
        }
        System.out.println("Total balance in sender's account is - " + initialAmountSend);
        System.out.println("Total balance in rec's account is - " + initialAmountInRec);
    }
}
