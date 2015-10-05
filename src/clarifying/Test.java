package clarifying;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;  

//public class Test {
//	public static void main(String args[]) {
//		try{
//			invalidMeth();
//			System.out.println("1");
//		}catch(Exception e){
//			
//			System.out.println("2");
//		}finally{
//			System.out.println("3");
//		}
//		System.out.println("22");
//	}
//	public static void invalidMeth(){
//		throw new Error();
//	}
//}
class Animals
{
  String name = "animal";
  String makeNoise()  { return "generic noise"; }
}
class Dog extends Animals 
{
  String name = "dog";
  String makeNoise() {  return "bark"; }
}
public class Test 
{
	static Boolean[] arr = new Boolean[3];
	
  public static void main(String[] args)
  { 
	  Boolean data = arr[1];
	  System.out.println(data);
   Animals an = new Dog();
   System.out.println(an.name+" "+an.makeNoise());
  }
}
		
//		
//		Test test = null;
//		System.out.println(test instanceof Test);
		
//		Map hs =new HashMap<String, String>();
//		hs.put(null,"value");
//		hs.put(null,"value2");
//		System.out.println(hs.toString());
//		
//		String a = "All";
//		String b = "All1";
//		String c = "All2";
//		
//		String result = a.concat(b.concat(c));
//		System.out.println(result);
//		int i, j = 0;
//		for (i = 10; i < 0; i--) {
//			j++;
//		}
//		switch (j) {
//		case (0):
//			j = j + 1;
//		case (1):
//			j = j + 2;
//			break;
//		case (2):
//			j = j + 3;
//			break;
//		case (10):
//			j = j + 10;
//			break;
//		default:
//			break;
//		}
//		System.out.println(j);
//	}
//}
//public class Test { public Test() { System.out.println("Constructor invoked "); } } public class B extends Test{ } 
//class Food implements Serializable{
//	int good = 3;
//	public static void main(String args[]){
//		Food f =new Food();
//	}
//}
//
//class Fruit extends Food{
//	int taste = 5;
//}
//class Mango  extends Fruit{
//	int color = 4;
//}
//class Test{
//	
//	public static void main(String args[]){
//		Mango b = new Mango();
//		//b.serialize();
//		Mango b2 = new Mango();
//		//b2 = b.deserailize();
//		b2 = b;
//		System.out.println("restore "+b2.color+b2.taste+b2.good);
//	}
//	
//}





//class Main {
//public static void printList (List<?> list){
//for(Object element:list){
//System.out.println(element); }}




//class RunnableThread implements Runnable {
//	RunnableThread() {
//		System.out.println("Child Thread: ");
//	}
//
//	public void run() {
//		System.out.println("Hi I'm a new thread");
//	}
//}
//

//public abstract static class Test {
//	 abstract  void main(String[] args); 
//	{
//		List<String> ls=new ArrayList<String>();
//		ls.add("One"); ls.add("Two"); ls.add("Three");
//		List<Integer> li=new ArrayList<Integer>(); li.add(new Integer(100));
//		li.add(new Integer(200));
//		li.add(new Integer(300));
//		printList(ls); //Compilation Error
//		printList(li); //Compilation Error 
//		}
//	}
//final void add (int a, int b){};
//final void add (int a, float b){};
//int add (float b, int a){
//	return a;};
//void add (int a, int b, float c){};
//}
//
	
//  class ExtThread extends Thread
//{
//static Thread t = new Thread();
//public void run()
//{
//	t.setPriority(10);
//	while(true){
//		System.out.println("Hi");
//	}
//	}
//} 

//  class Test {
//
//	/**
//	 * @param args
//	 */
//	static Boolean status = false;
//	public static void main(String[] args) {
//		
//		System.out.println("Hi I'm main thread");
//		ExtThread t=new ExtThread ();
//		t.start();
//		ExtThread t1=new ExtThread ();
//		t1.start();
//	}
//	/**
//	 * 
//	 */
//	public static void eeee() {
//		 SimpleDateFormat dateFormat = new SimpleDateFormat("M-dd-yyyy hh:mm:ss aa");
//		System.out.println(dateFormat.format(System.currentTimeMillis()));
//		
//		if(status == false)
//			System.out.println("False");
//		else
//			System.out.println("True");
//	}
//	
//	
//	
//}
//
//
//
//class Account {
//	int bankBalance;
//
//	public synchronized void debitAccount(int amount) {
//		try {
//			System.out.println("Checking for bal");
//			while ((bankBalance - amount) < 0) {
//				System.out.println("going to wait");
//				wait();
//			}
//			System.out.println("debiting..");
//			bankBalance -= amount;
//		} catch (Exception e) {
//		}
//	}
//
//	public synchronized void creditAccount(int amount) {
//		bankBalance += amount;
//		System.out.println("bal=" + bankBalance + " notify");
//		notify();
//	}
//}
//
//
//class Thread2 extends Thread {
//	Account ac;
//
//	Thread2(Account ac) {
//		this.ac = ac;
//	}
//
//	public void run() {
//		int i = 100;
//		while (i <= 300) {
//			ac.creditAccount(100);
//			i += 100;
//		}
//	}
//}
//
//class Thread1 extends Thread {
//	Account ac;
//
//	Thread1(Account ac) {
//		this.ac = ac;
//	}
//
//	public void run() {
//		ac.debitAccount(300);
//	}
//}
//
//public class Test {
//	public static void main(String[] args) {
//		Account ac = new Account();
//		Thread1 t1 = new Thread1(ac);
//		t1.start();
//		Thread2 t2 = new Thread2(ac);
//		t2.start();
//	}
//}

