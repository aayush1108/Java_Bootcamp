package arrays;

public class ArrayDemo2 {
    public static void main(String[] args){
        // Create an array of strings with 5 elements.
        String[] names = new String[5];

        // Initialize the array elements.
        names[0] = "Aayush";
        names[1] = "Bibek";
        names[2] = "Rohit";
        names[3] = "Abc";
        names[4] = "Xyz";
        try{
        names[5] = "Error";
        } catch (Exception ex){
            System.out.println("Error occured");
        }


        // Iterate over the array and print each element to the console.
        for(int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

    }
}
