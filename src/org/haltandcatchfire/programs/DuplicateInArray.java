package org.haltandcatchfire.programs;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		
		
		
	 
		System.out.println(isDuplicatePresent(new Integer[]{21,343,54,6,73,345,656,76,2,1,67,6}));

	}

	
	
	//Using HashSet 
	public static boolean isDuplicatePresent(Integer[] n)
	{
		HashSet<Integer> h=new HashSet<>();
		boolean duplicate=false;
		
		for(int i=0;i<=n.length-1;i++)
		{
		if(h.add(n[i])==false)//Duplicate is not allowed in HashSet. If try to add duplicate it returns false
			
				duplicate=true;
	 
			 
		}
		return duplicate;
		 
	}
}
