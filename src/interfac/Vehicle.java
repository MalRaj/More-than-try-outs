package interfac;

interface Moveable 
{
 int AVG_SPEED = 40;
 void move();
 void stop();
}


interface NewsPaper
{
 void news();
}

interface Magazine extends NewsPaper,Moveable
{
	void colorful();
}


public class Vehicle implements Moveable ,NewsPaper
{
 public void move()
 {
  System.out.print ("Average speed is 89");
 }
 
 public static void main (String[] arg)
 {
  Vehicle vc = new Vehicle();
  vc.move();
 }

public void stop() {
	// TODO Auto-generated method stub
	
}

@Override
public void news() {
	// TODO Auto-generated method stub
	
}
}
