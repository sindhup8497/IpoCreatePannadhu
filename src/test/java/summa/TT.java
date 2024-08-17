package summa;

public class TT {
	public static void main(String[] args) {
	
	checkAge(20);
		
		System.out.println("Successful Execution");
	}
	public static void checkAge(int age)
	{
		if(age<18)
		throw new IllegalArgumentException("Age should be greater than 18");
	}

}

