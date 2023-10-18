package multi_threading;

public class ThreadDemo2 implements Runnable{

    public static void main(String[] args) {

        ThreadDemo2 t1 = new ThreadDemo2();
        Thread t2 = new Thread(t1);
        t2.start();
    }
    @Override
    public void run() {
        System.out.println("Running thread");

    }
}
