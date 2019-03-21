package com.javabasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LearnMore {
	public static void main(String args[]){
		
		String data1 = "Learn more , Learn More , learn more, learn More , Learn more , learn";
	       
		String regex = "Learn more";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(data1);
		while (matcher.find())
		{
		 System.out.println(matcher.group() + "\n");
		}
		
		
	}
}
