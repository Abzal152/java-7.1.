class GoodMorningRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Good Morning runnable interrupted");
                return;
            }
        }
    }
}

class HelloRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Hello runnable interrupted");
                return;
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Welcome runnable interrupted");
                return;
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread goodMorning = new Thread(new GoodMorningRunnable());
        Thread hello = new Thread(new HelloRunnable());
        Thread welcome = new Thread(new WelcomeRunnable());

        goodMorning.start();
        hello.start();
        welcome.start();
    }
}
