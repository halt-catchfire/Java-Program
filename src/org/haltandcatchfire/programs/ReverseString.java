package org.haltandcatchfire.programs;

public class ReverseString {

	public static void main(String[] args) {
		 
		
		
		
		System.out.println(reverseString("Rahul"));
		
		String s="Yashu";
	 
		
	}
	
	
	public static String reverseString(String input)
	{
		StringBuilder builder=new StringBuilder(input);
		int length=builder.length();
		
		for(int i=0;i<length/2;i++)
		{
			char current=builder.charAt(i);
			int otherEnd=length-i-1;
			
			builder.setCharAt(i, builder.charAt(otherEnd));
			builder.setCharAt(otherEnd, current);
		}
		return builder.toString();
	}

}
