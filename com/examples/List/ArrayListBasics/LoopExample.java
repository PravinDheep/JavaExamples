package com.examples.List.ArrayListBasics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class LoopExample {
	
	public static void main(String[] args) {
		ArrayList<Integer> listId = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4)
				);
		System.out.println("Array List Elements : " + listId);
		System.out.println("Array List in For Loop: ");
		for(int counter = 0 ; counter < listId.size() ; counter++){
			 System.out.println(listId.get(counter));
		}
		System.out.println("Array List in For Each Loop: ");
		for(int count : listId){
			System.out.println(count);
		}
		System.out.println("Array List using Iterator :");
		Iterator<Integer> iterate = listId.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
	}
}

