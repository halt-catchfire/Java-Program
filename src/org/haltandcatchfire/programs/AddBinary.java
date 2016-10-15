package org.haltandcatchfire.programs;

public class AddBinary {

	public static void main(String[] args) {
		
		
		
		
		
		System.out.println(addBinary("1110","1111"));
		
	 
		 

	}
	
	
	
	//Using Wrapper class Integer methods.
	public static String addBinary(String b1,String b2)
	{
		 
	 int number1=Integer.parseInt(b1,2);
	 int number2=Integer.parseInt(b2,2);
	 
	 int sum=number1+number2;
	 return  Integer.toBinaryString(sum);
	 
	}
	
	//Without using any built in methods
	
	public static String binaryAddition(String s1, String s2) 
	
	{
	    if (s1 == null || s2 == null) 
	    	return "";
	    
	    int first = s1.length() - 1;
	    int second = s2.length() - 1;
	    
	    StringBuilder sb = new StringBuilder();
	    int carry = 0;
	    
	    
	    while (first >= 0 || second >= 0) {
	    	
	        int sum = carry;
	        
	        if (first >= 0) {
	            sum += s1.charAt(first) - '0';
	            first--;
	        }
	        
	        if (second >= 0) {
	            sum += s2.charAt(second) - '0';
	            second--;
	        }
	        
	        carry = sum >> 1;
	        sum = sum & 1;
	        sb.append(sum == 0 ? '0' : '1');
	    }
	    if (carry > 0)
	        sb.append('1');

	    sb.reverse();
	    return String.valueOf(sb);
	}
	

}
