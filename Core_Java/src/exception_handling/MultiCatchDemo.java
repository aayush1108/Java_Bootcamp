package exception_handling;

public class MultiCatchDemo {
    public static void main(String[] args) {
        m1(10,4);
        m1(10,0);
        m1(15,5);

    }
    public static void m1(int a, int b){
        try{
            m2(a,b);
        }catch (ArithmeticException e){
            System.out.println("You can not divide a number by 0");
        } catch(Exception e){

        }

    }
    public static void m2(int a, int b){
        System.out.println(a/b);
    }
}
