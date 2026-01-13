package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		
		int age=16;
		if(age>18)
		{
			System.out.println("Eligible to voting");
		}
		else
		{
			throw new ArithmeticException("Age under 18");
		}
			
		// TODO Auto-generated method stub

	}

}
