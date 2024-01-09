package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002 
	{
	
		@Test(groups= {"regression"})
		public void verify_testcase002_logout() 
		{
			
			
			try 
			{
												
			System.out.println("confirmation dashboard message for testcase 002: ");				
			}//end of try block
			catch(Exception e)
			{
				
				Assert.fail();
			}
			
			
		}
		
	}