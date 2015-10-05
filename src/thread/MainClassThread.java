package thread;

import java.io.IOException;

class TryThread implements Runnable {
  public TryThread(String firstName, String secondName, long delay) {
    this.firstName = firstName;
    this.secondName = secondName;
    aWhile = delay;
    //setDaemon(true);
  }
  public void run() {
    try {
      while (true) {
        System.out.print(firstName + "\n");
        Thread.sleep(aWhile);
        System.out.print(secondName + "\n");
      }
    } catch (InterruptedException e) {
      System.out.println(firstName + secondName + e);
    }
  }
  private String firstName;
  private String secondName;
  private long aWhile;
}
public class MainClassThread {
  public static void main(String[] args) {
    Thread first = new Thread(new TryThread("A ", "a  ", 200L));
    Thread second = new Thread(new TryThread("B ", "b ", 200L));
    Thread third = new Thread(new TryThread("C ", "c ", 200L));
    System.out.println("Press Enter when you have had enough...\n");
    first.start();
    second.start();
    third.start();
    try {
      System.in.read();
      System.out.println("Enter pressed...\n");
    } catch (IOException e) {
      System.out.println(e);
    }
    return;
  }
}


