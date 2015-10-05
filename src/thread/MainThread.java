package thread;

class MainThread extends Thread 
{
 public static void main(String[] args)
 {
	 MainThread my = new MainThread();
  Thread t = new Thread(my);
  t.start();
 }
public void run()
{
 for(int i=0; i< 3; i++){
 System.out.println(i+"..");
} } }
