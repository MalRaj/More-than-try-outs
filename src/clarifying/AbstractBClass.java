package clarifying;

class AbstractBClass extends AbstractClass
{
 void callme()
 {
  System.out.println("this is callme."); 
 }
 void dontCallme() {
		// TODO Auto-generated method stub
		
	}
 public static void main(String[] args)
 {
	 AbstractClass a = new AbstractClass(){

		@Override
		void callme() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void dontCallme() {
			// TODO Auto-generated method stub
			
		}
		 
	 };
	 ;
 }

}