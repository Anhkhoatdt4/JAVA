package mutable;

public class Ex02SingleThread {
    public static void main(String[] args) {

        System.out.println("Ex02SingleThread..started");

        System.out.println(getCurrentThreadName() + " is running");

        Runnable runa = () -> {
            // Your code to be executed in the thread goes here
            System.out.println("Thread is running...");
        };

        Thread thread = new Thread(runa, getCurrentThreadName());
        thread.start(); // Start the thread

        System.out.println("is Finished ....");
    }

    private static String getCurrentThreadName() {
        return Thread.currentThread().getName();
    }
}
