package thread;

class First {
	public synchronized void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second extends Thread {
	String msg;
	First fobj;

	Second(First fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	public void run() { //to make the thread use the resouce correctly we provide a serialized access to the object being used,making the objetc and block as synchronized
	//	synchronized(fobj){
			//System.out.println(msg);
		fobj.display(msg);
	//	}
	}
}

public class Syncro {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "welcome");
		//ss.start();
		Second ss1 = new Second(fnew, "new");
		Second ss2 = new Second(fnew, "programmer");
	}
}
