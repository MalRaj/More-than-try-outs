package thread;

class NewThread implements Runnable {
	  Thread t;

	  NewThread() {
	    t = new Thread(this, "Demo Thread");
	    System.out.println("Child thread: " + t);
	    t.start(); // Start the thread
	  }

	  public void run() {
	    try {
	      for (int i = 5; i > 0; i--) {
	        System.out.println("Child Thread: " + i);
	        Thread.sleep(500);
	      }
	    } catch (InterruptedException e) {
	      System.out.println("Child interrupted.");
	    }
	    System.out.println("Exiting child thread.");
	  }
	}

	class ThreadDemo {
	  public static void main(String args[]) {
	    
	    try {
	      for (int i = 5; i > 0; i--) {
	        System.out.println("Main Thread: " + i);
	        new NewThread();
	        Thread.sleep(1000);
	      }
	      new NewThread();
	    } catch (InterruptedException e) {
	      System.out.println("Main thread interrupted.");
	    }
	    System.out.println("Main thread exiting.");
	  }
	}
