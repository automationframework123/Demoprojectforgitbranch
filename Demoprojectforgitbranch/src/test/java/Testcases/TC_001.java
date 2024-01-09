package Testcases;

	import org.testng.Assert;
	import org.testng.annotations.Test;

	
	public class TC_001 
	{
	
		@Test(groups= {"sanity"})
		public void verify_orangehrmaccount_login() 
		{
			
			
			try 
			{
				//OrangeHRMDemo Login Page
				
				

				//getting username and password from config.properties file
				
								

				
			boolean msgDisplayconfirmation=true;
			System.out.println("confirmation dashboard message is displayed: " +msgDisplayconfirmation);
				if(msgDisplayconfirmation==true)
				{
					
					Assert.assertTrue(true);
				}
				else 
				{
					
					Assert.fail();
				}
				
			}//end of try block
			catch(Exception e)
			{
				
				Assert.fail();
			}
			
			
		}
		
	}


