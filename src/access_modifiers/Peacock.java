package access_modifiers;

class Bird
{
  public void eat()             // final method, cannot be overridden
  {
    System.out.println("Birds eat");
  }
  public void fly()	              // non-final method, can be overridden
  {
    System.out.println("Birds fly");
  }
}
public class Peacock extends Bird
{
  public void fly()
  {
    System.out.println("Peacock flies small distances");
  }
  public final void eat()
  {
    System.out.println("Peacock eats small flies");
  }
  public static void main(String args[])
  {
    Peacock p1 = new Peacock();
    p1.eat();                         // calling super class final method
    p1.fly();                         // calling its own overridden method
  }
}
