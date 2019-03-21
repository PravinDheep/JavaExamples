package com.javabasics;

import java.lang.reflect.Method;

public class ReflectMethod {

	public static void main(String[] args) {
		ReflectMethod ref = new ReflectMethod();
		Class c = ref.getClass();
		System.out.println("I am from " + c + " this class");
		try{
			//Class[] cArg = new Class[1];
	        //cArg[0] = Long.class;	
			Method m = c.getMethod("showForm" , null);
			System.out.println(m);
			System.out.println(m.isAccessible());
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

	public void show(){
		System.out.println("I am from show method.");
	}
	
	public boolean showForm(){
		System.out.println("I am from showForm method.");
		return true;
	}
	long l = 1234312;
}
