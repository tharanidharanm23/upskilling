/******************************************************************************

26. Thread Creation
• Objective: Implement multithreading.
• Task: Create and run two threads that print messages.
• Instructions:
o Define a class that extends Thread or implements Runnable.
o In the run() method, print a message multiple times.
o Start both threads and observe the output.


*******************************************************************************/

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}