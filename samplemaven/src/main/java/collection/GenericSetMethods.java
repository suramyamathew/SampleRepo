package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		
		Set <String> s=new HashSet <String>();
		
		s.add("White");
		s.add("Black");
		Set <String> s1=new HashSet <String>();
		s1.add("Pink");
		s1.add("Blue");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("Pink")); 
		System.out.println(s1.containsAll(s));
		System.out.println(s.isEmpty());
		s.remove("White");
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());
		s.clear();
		System.out.println(s);
		
	}

}
