package mpack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(dataProvider="getData")
	public  void sampleAutomation(String usaername,String password) {
		
		System.out.println("succesfully login with user "+usaername+" and password"+password);
		
		
		}
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data= {{"arun","123"},{"aun","1233"},{"arsdfun","12ee3"}};
		
		return data; 
	}
	
	
	
}
