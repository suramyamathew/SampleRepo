package abstraction;

public class AbstractChild extends AbstractionParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.sample();
		obj.show();
		//reference creation
		AbstractionParent obj1=new AbstractChild();
		obj1.display();
		obj1.sample();
	}

	@Override
	public void display() {
		System.out.println("Abstract Method");
		// TODO Auto-generated method stub
		
		
	}

	public void show()
	{
		System.out.println("show method");
	}
}
