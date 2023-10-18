package multi_threading;

public class ThreadDemo3 extends Thread {
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(i);
            try{
               Thread.sleep(20000);
            } catch(InterruptedException e){
                System.out.println("Exception occured");

            }

        }

    }

    public static void main(String[] args) {
        ThreadDemo3 t = new ThreadDemo3();
        t.start();
    }
}
