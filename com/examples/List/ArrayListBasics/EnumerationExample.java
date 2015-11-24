package com.examples.List.ArrayListBasics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
public class EnumerationExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("PineApple");
		fruits.add("Guava");
		fruits.add("Pear");
		Enumeration<String> listfruits = Collections.enumeration(fruits);
		System.out.println("Elements using Enumeration : ");
		while( listfruits.hasMoreElements()){
			System.out.println(listfruits.nextElement());
		}
	}
}
