package interfac;

interface Animals
{
 void type();
}
public class ATest {
  static Animals an = new Animals(){         //Annonymous class created
  public void type()
  {
   System.out.println("Annonymous animal"); 
  }
 };
 public static void main(String args[])
 {
  System.out.println("Annonymous animal 2222"); 
  an.type();      
 }
}