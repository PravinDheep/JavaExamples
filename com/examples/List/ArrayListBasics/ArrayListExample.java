package com.examples.List.ArrayListBasics;
import java.util.*;
public class ArrayListExample{

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>( Arrays.asList("A", "B")/*Initialize using ArrayList*/ );
		ArrayList<String> alotherway = new ArrayList<String>(){
			private static final long serialVersionUID = 2L;
		{
			add("New");
		}};
		System.out.println("Another way of ArrayList Initialization : " +alotherway);
		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 6));
		  System.out.println("\n ArrayList items: "+intlist);
		  System.out.println("\n ArrayList Collection nCopies :" + intlist);	  
		al.add("C"); //Add as String
		al.add("D");
		al.add("D");
		al.add(1,"One"); //Add as Index,String
		System.out.println("\n Array Elements : \n" +al);		 
 		al.add(2,"Two"); //Add as Index,String
 		al.add(5,"four");
		System.out.println("\n Array Elements with Index : \n" +al);
		al.remove(2);//Remove as Index		
		System.out.println("\n Array List Final: \n" +al);
		al.set(2,"Two");
		System.out.println("\n Replacing of Array List: " +al);		
		System.out.println("\n The index value of " + al.get(2) + " is : " +al.indexOf("Two"));
		System.out.println("\n The size of Object is : " + al.size());
		System.out.println("\n Does this object contains " + al.get(1) + " : " + al.contains("One") );
		System.out.println("\n Hash Code : " + al.hashCode() );
		System.out.println("\n Clone : " + al.clone() );
		al.ensureCapacity(20);
		al.add("E");
		 for (String temp: al) {
	            System.out.println(temp);
	      }
		if( al.isEmpty() != true ) {
		al.clear();
		System.out.println("\n ArrayList Object Elements Cleared");
		}		
	}
}
