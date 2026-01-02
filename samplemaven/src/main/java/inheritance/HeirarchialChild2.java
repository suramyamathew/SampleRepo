package inheritance;

public class HeirarchialChild2 extends HeirarchialParent {
	public void display2()
	{
		System.out.println("Child2");
	}

	public static void main(String[] args) {
		HeirarchialChild2 obj=new HeirarchialChild2();
		obj.display2();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
