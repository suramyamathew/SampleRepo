package superkeyword;

public class SuperConstructorChild extends SuperConstructor{
	public SuperConstructorChild()
	{
		super(5,6);
		
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();
		
		// TODO Auto-generated method stub

	}

}
