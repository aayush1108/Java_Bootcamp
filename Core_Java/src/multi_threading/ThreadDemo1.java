package multi_threading;

public class ThreadDemo1 extends Thread{
    public void run() {
        System.out.println("Inside the run method" +Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo1 t2 = new ThreadDemo1();

        t1.start();
        t2.start();
        t1.setName("-t1");
        t2.setName("-t2");

    }
}

