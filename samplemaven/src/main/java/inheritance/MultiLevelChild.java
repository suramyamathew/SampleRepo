package inheritance;

public class MultiLevelChild extends MultiLevelParent {
public void print1() {
	System.out.println("child");
}
	public static void main(String[] args) {
		 MultiLevelChild obj=new  MultiLevelChild();
		 obj.display();
		 obj.print();
		 obj.print1();
		 
		// TODO Auto-generated method stub

	}

}
