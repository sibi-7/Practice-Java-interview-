//Basic Concurrency (Threads)
//Creating a Thread
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        int a=5 , b=10;
        int c=a+b;
        System.out.println(c);

    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
