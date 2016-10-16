package org.haltandcatchfire.programs;

class Popcorn 
{
	public void taste()
	{
		System.out.println("salty");
	}
}
public class AnonymousInnerClass {

	public static void main(String args[])
	{
	Popcorn p=new Popcorn()
			{
		public void taste()
		{
		System.out.println("spicy");
		}
		};
		p.taste();
		System.out.println(p.getClass().getName());
			}
}