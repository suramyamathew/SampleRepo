package inheritance;

public class MultipleChild implements MultipleParent1,MultipleParent2{
	
	public void show()
	{
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleChild obj=new MultipleChild();
		obj.display();
		obj.print();
		obj.show();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Parent1");
		
	}

	@Override
	public void display() {
		System.out.println("Parent2");
		// TODO Auto-generated method stub
		
	}

}
