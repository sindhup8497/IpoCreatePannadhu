package summa;

public class MainController {

	public static void main(String[] args) {
		
		B obj1 = new B();
		obj1.m2();
		obj1.m1();
		System.out.println(obj1.a);
		
		   Typecasting obj2 = new B();
		   obj2.m1();
		   System.out.println(obj2.a);
		   
		      B obj3 =  (B  ) obj2;

	}

}
