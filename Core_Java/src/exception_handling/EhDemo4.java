package exception_handling;

public class EhDemo4 {
    public static void main(String[] args) {
        m1(10, 4);
        m1(10,0);
        m1(15,5);


    }
    public static void m1(int a, int b){
        m2(a, b);

    }

    public static void m2(int a, int b) {
        try{
            System.out.println(a/b);
        }catch(Exception ex){
            System.out.println("Error occured");
        }


    }
}
