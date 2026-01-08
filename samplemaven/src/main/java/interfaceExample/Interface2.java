package interfaceExample;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface2 obj=new Interface2();
		obj.display();
		obj.print();
		obj.sample();
		//reference creation
		Interface1 obj1=new Interface2();
		obj1.display();
		obj1.print();
	}
	
	
	public void sample()
	{
		System.out.println("inhertance sample");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface display");
	}

	@Override
	public void print() {
		System.out.println("interface print");
		// TODO Auto-generated method stub
		
	}

}
