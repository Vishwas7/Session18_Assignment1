package Assignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList { //class name

	public static void main(String[] args) { // main method
		
		
		ArrayList<String>citylist= new ArrayList<String>(); // ArrayList Object
		
		//Adding city to CityList.
		
		citylist.add("Delhi");  // window console
		citylist.add("Mumbhai"); // window console
		citylist.add("Chennai"); // window console
		citylist.add("kolkata");// window console
		citylist.add("Hyderabad");// window console
		
		Iterator<String> itr= citylist.iterator(); // Iterator method 
		System.out.println("Iterating through the citylistlist");// window console
		
		
		
		while (itr.hasNext()){ //hasNext() and next() method of Iterator to iterate.
			System.out.println(itr.next());
		}
	}

}
