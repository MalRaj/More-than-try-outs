package gc;

import clarifying.Test;

public class GarbageCollection {

	public static void main(String[] args)
    {
        Test t = new Test();
        t=null;
        System.gc();
    }
    public void finalize()
    {
        System.out.println("Garbage Collected");
    }

}
