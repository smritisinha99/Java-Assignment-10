public class ThreadDemo implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        // Start the thread
        thread.start();
        // Check if the thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is alive");
        } else {
            System.out.println("Thread is not alive");
        }
        try {
            // Wait for the thread to finish
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Check if the thread is alive after join
        if (thread.isAlive()) {
            System.out.println("Thread is alive");
        } else {
            System.out.println("Thread is not alive");
        }
    }
}