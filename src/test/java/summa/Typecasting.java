package summa;

 class Typecasting {
	
	int a=10;
	public void m1() {
		
		System.out.println("print m1");
	}
     public void m2() {
    	 System.out.println("print m2");
    	 
     }
	
}
   class B extends Typecasting{
	   
	   int a=12;
	   public void m1() {
		   System.out.println("print m1 child");
	   }
	   public void m3() {
		   System.out.println("print m3 ");
	   }
	
}
