public class VariableDemo {

    int instanceVariable = 10;
    static int staticVariable = 20;
    String name = "Aayush";
    static boolean isAdmin = true;
    String email = "koiralaaayush20@gmail.com";
    int employeeId = 100;
    float salary = 1500;


    public static void main(String[] args){
        System.out.println("This is variable Demo");
        VariableDemo v = new VariableDemo();
        System.out.println(v.instanceVariable);
        System.out.println(v.name);
        System.out.println(staticVariable);
        System.out.println(isAdmin);

        m1();
    }
    public static void m1(){
        int localVariable = 5;
        System.out.println(localVariable);
    }
}
