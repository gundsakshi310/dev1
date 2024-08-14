package demo;

import org.testng.annotations.Test;

public class qsp1 {

	@Test
	public void rev()
	{
		String s="sakshi";
		String empty="";
		for(int i=5;i>=0;i--)
		{
			empty=empty+s.charAt(i);
		}
		System.out.println(empty);
		
	}

}
