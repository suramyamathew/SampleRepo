package exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		
		int age=16;
		if(age>18)
		{
			System.out.println("Eligible to voting");
		}
		else
		{
			throw new VotingException("Age under 18");
		}
			
		// TODO Auto-generated method stub

	}

}
