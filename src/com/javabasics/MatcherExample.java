package com.javabasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample
{
    public static void main( String args[] ){

      String line = "This order Learn more was placed Learn more for QT3000! OK?";
      String pattern = "Learn more";

      Pattern r = Pattern.compile(pattern, 1);
      Matcher m = r.matcher(line);

      while(m.find( )) {
         System.out.println("Found value: " + m.group() );
      } 
   }
}