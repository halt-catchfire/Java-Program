package org.haltandcatchfire.programs;

public class ReverseArray {

	public static void main(String[] args) {
	 
		
		
	//	reverse(new int[]{32,54,65,6,7,76});
		


		int[] d=reverseImprovised(new int[]{1,2,3,4,54,5,6,67,7});
		for(int i:d)
		{
			System.out.println(i);
		}
		

	}

	
	//worst logic
	public static void reverse(int[] n)
	{

		for(int i=n.length-1;i<=n.length;i--)
		{
			if(i==-1)
			break;
			System.out.println(n[i]);
		}
		 
	}
	
	//improvised logic
	public static int[] reverseImprovised(int[] a)
	{
		
		int index=a.length; //find the length of given Array
		int[] b=new int[index];//create new array with the same length
		for(int i:a)
		{
			b[index-1]=i;
			index--;
		}
		return b;
	}
	
	
}
