package superkeyword;

public class SuperMethodChild extends SuperMethod {
	public void display1()
	{
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.display1();
		
		// TODO Auto-generated method stub

	}

}
