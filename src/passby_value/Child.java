package passby_value;

class Parent{ }

public class Child extends Parent
{
    public void check()
    {
        System.out.println("Sucessfull Casting");
    }

    public static void show(Parent p)
    {
       if(p instanceof Child)
       {
           Child b1=(Child)p;
           b1.check();
       }
    }
    
    public static void main(String[] args)
    {
      
    	Parent p= (Child) new Parent();
      
      Child.show(p);
      
      }
}