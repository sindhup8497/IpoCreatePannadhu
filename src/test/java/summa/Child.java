package summa;
class Parent
{
	int a=18;
	public void m1() {
		System.out.println("m1 from parent");
	}
	public void m2()
	{
		System.out.println("m2 from parent");
	}
}


public class Child extends  Parent {
  int b=14;
  public void m1() {
		System.out.println("m1 from child");
	}
  public void m3() {
		System.out.println("m3 from child");
	}
  
  
  public static void main(String[] args) {
	  Child c= new Child();
	  c.m1();
	  c.m2();
	  System.out.println(c.b);
	  c.m3();
	  
	  Parent p=c;
	  p.m1();
	  p.m2();
	  
	  
	  System.out.println(p.a);
	  
	   c=(Child)p;
	   c.m1();
	   c.m2();
	   System.out.println(c.b);
	  
	
}
  
  
}
