package aggregation;

public class Aggregation2 {
	String city;
	String state;
	Aggregation1 ref;
	public Aggregation2(String city,String state,Aggregation1 ref)
	{
	this.city=city;
	this.state=state;
	this.ref=ref;
	
	}
	public void display()
	{
	System.out.println(ref.name+" "+ref.rollno+" "+ref.address+" "+city+" "+state);
	}
	
	public static void main(String[] args) {
		
		Aggregation1 obj=new Aggregation1("suramya",25,"ontario");
		Aggregation2 obj1=new Aggregation2("london","on" ,obj);
		obj1.display();
		
		
	}

}
