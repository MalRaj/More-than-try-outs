package thread;


 class RunnableThread implements Runnable
{
 public void run()
 {
  System.out.println("concurrent thread started running..");
 }
}

 public class MyThreadDemo
{
 public static void main( String args[] )
 {
	 RunnableThread mt = new RunnableThread();
	 //mt.run();
	 System.out.println("after concurrent thread started running..");
	 Thread t = new Thread(mt);
	 t.start();
	 System.out.println("completed concurrent thread run..");
	 System.out.println("completed concurrent thread run 12..");
	 System.out.println("completed concurrent thread run 1234..");
 }
}