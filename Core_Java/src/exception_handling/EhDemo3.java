package exception_handling;

public class EhDemo3 {
    static int initialBalance = 500;
    static int amountTowithdraw = 200;

    public static void main(String[] args) {
        if(initialBalance >= amountTowithdraw){
            try{
                initialBalance = initialBalance - amountTowithdraw;
                System.out.println(5/0);
            } catch(Exception ex) {
                System.out.println("Server error");
                initialBalance = initialBalance + amountTowithdraw;
                
            }


        } else{
            System.out.println("Insufficient balance");
        }
        System.out.println("Balance in the account is - " + initialBalance);
        System.out.println("Amount to be withdrawn is - " + amountTowithdraw);
    }
}
