package inheritance;

public class HeirarchialChild extends HeirarchialParent {
public void print()
{
	System.out.println("Child1");
}
	public static void main(String[] args) {
		HeirarchialChild obj=new HeirarchialChild();
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}

}
