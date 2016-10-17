package org.haltandcatchfire.programs;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//non-changeable or immutable
		String s = "durga";
		s.concat("software");
		System.out.println(s);
		
		//changeable or mutable
		StringBuffer sb=new StringBuffer("durga");
		sb.append("software");
		System.out.println(sb);
	
	String s1=new String("yashu");
	String s2=new String("yashu");
	System.out.println(s1==s2);//false address comparision
	System.out.println(s1.equals(s2));//true content comparision
	
	
	
	
	StringBuffer s3=new StringBuffer("rahul");
	StringBuffer s4=new StringBuffer("rahul");
	System.out.println(s3==s4);//false
	System.out.println(s3.equals(s4));//false
	
	
	String s5="durga";//only one abject created : in SCP with object ref
	
	
	String s6=new String("durga");//here 2 objects created: one in heap with obj ref;one in SCP with no abject ref
	
	
	//Garbage collector not allowed to access SCP
	
	}

}
