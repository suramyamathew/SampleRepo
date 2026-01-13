package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		
		List <String> a=new ArrayList<String>();
		
		//Add Method
		
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("Red");
		
		System.out.println(a);
		
		//Get Method
		
		System.out.println(a.get(0));
		
		//Set Method
		
		a.set(1, "White");
		System.out.println(a);

		//Indexof
		
		System.out.println(a.indexOf("Red"));
		System.out.println(a.indexOf("Black"));
		
		//LastIndexof
		
		System.out.println(a.lastIndexOf("Red"));
	
	
	System.out.println(a.lastIndexOf("Black"));
	
	//Remove
	
	a.remove(1);
	System.out.println(a);
	
	//Contains
	
	System.out.println(a.contains("black"));
	//isempty
	
	System.out.println(a.isEmpty());
	
	//size
	
	System.out.println(a.size());

}
}
