package Adarsh;

public class Fibonacci_Reverse_Thread {
    public static void main(String[] args) {
        FibonacciThread F = new FibonacciThread();
        ReverseOrderThread R = new ReverseOrderThread();

        // Create a common monitor object to synchronize on
        Object monitor = new Object();

        Thread t1 = new Thread() {
            public void run() {
                synchronized (monitor) {
                    F.Fibonacci();
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (monitor) {
                    R.Reverse();
                }
            }
        };

        t1.start();
        t2.start();
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
    }
}