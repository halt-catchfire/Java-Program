package org.haltandcatchfire.programs;

public class ParseIntProg {

	public static void main(String[] args) {
		 
		
		
		
		System.out.println(ConvertStringToInt("10"));

	}
	
	public static int ConvertStringToInt(String s)
	{
		 int num =0;
		 int i=0;
		 boolean isNegetive=false;
		 
		 //check whether number is -ve/+ve and if yes then set index to 1 and isNegetive to true
		 if(s.charAt(0)=='-')
		 {
			 isNegetive=true;
			 i=1;
		 }
		    for(;i<s.length();i++) //10
		    {
		    	//numbers ascii code range from 48-57
		        if(((int)s.charAt(i)>=48)&&((int)s.charAt(i)<=57))
		        {
		            num = num*10+ ((int)s.charAt(i)-48);
		        }
		        else
		        {
		        	//if not number then throw exception
		            throw new NumberFormatException();
		        }

		    }
		    return isNegetive?-num:num;
	}

}
