public class Employee {
    public static void main (String[] args){

        System.out.println("This is test");
        getEmployeeName();
        getEmployeeCountry();
        System.out.println();

    }
    static String employeeName= "aayush";
    String country = "Nepal";
    public static void getEmployeeName(){
        System.out.println("Employee Name is " + employeeName);

    }
    public static void getEmployeeCountry(){
        Employee  d = new Employee();
        System.out.println("Employee Country is "+ d.country);
    }
}
