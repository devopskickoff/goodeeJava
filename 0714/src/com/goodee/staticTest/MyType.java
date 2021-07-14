package com.goodee.staticTest;

public class MyType {
	public static boolean isCapital(char c)
	   {
	      if(c>='A' && c<='Z')
	         return true;
	      return false;
	   }
	   
	   public static boolean isAlpha(char c)
	   {
	      if(c>='A' && c<='Z' || c>='a' && c<='z')
	         return true;
	      return false;
	   }
	   
	   public static boolean isDigit(char c)
	   {
	      if(c>='0' && c<='9')
	         return true;
	      return false;
	   }
	   
	   public static String toUpper(String s)
	   {
	      String r="";
	      for(int i=0; i<s.length(); i++)
	      {
	         if(s.charAt(i)>='a' && s.charAt(i)<='z')
	         {
	            r = r + (char)(s.charAt(i)-32);
	         }
	         else
	            r = r+s.charAt(i);
	      }
	      
	      return r;
	   }
	   
	   public static String toLower(String s)
	   {
	      String r="";
	      for(int i=0; i<s.length(); i++)
	      {
	         if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	         {
	            r = r + (char)(s.charAt(i)+32);
	         }
	         else
	            r = r+s.charAt(i);
	      }
	      
	      return r;
	   }
	}

