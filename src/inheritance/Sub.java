package inheritance;

import java.io.*;
class Super
{
 void show() throws Exception 
 { System.out.println("parent"); }
}

public class Sub extends Super 
{
  void show() throws IOException		
  { System.out.println("child"); } 

  public static void main( String[] args ) throws Exception
  {
    Super s = new Sub();
    s.show();
  }  
}
