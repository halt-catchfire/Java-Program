package org.haltandcatchfire.programs;

public class Test {

	public static void main(String[] args) {
		
		
		
		
		
		FinalDemo f1=new FinalDemo();
		testFinal(f1);
		System.out.println(f1.getName());
	 

	}

	
	private static void testFinal(final FinalDemo f) //Why this is not throwing an error?
	{
		 
		f.setName("Rahul");
	}
}
