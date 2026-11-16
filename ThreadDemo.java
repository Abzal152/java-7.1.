class GoodMorningThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Good Morning thread interrupted");
                return;
            }
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Hello thread interrupted");
                return;
            }
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Welcome thread interrupted");
                return;
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        GoodMorningThread goodMorning = new GoodMorningThread();
        HelloThread hello = new HelloThread();
        WelcomeThread welcome = new WelcomeThread();

        goodMorning.start();
        hello.start();
        welcome.start();
    }
}
