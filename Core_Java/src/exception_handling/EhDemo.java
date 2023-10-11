package exception_handling;

import java.sql.SQLOutput;

public class EhDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(12/6);
        System.out.println(12/4);
        try {
            System.out.println(5/0);
        } catch(Exception ex) {
            //ex.printStackTrace();
            System.out.println("Exception occured");
        } finally {
            System.out.println("Now inside");
        }

        System.out.println(5/1);
    }

}
