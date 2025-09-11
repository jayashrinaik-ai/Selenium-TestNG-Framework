package utility;

import org.testng.annotations.DataProvider;

//import org.testng.annotations.DataProvider;


public class DataProviders {
	
	@DataProvider(name="loginData")
	
	public Object[][] getLoginData()
	{
		String filepath ="C:\\Users\\vikas\\eclipse-workspace\\com.nxgn\\Resources\\testData (1).xlsx";
		
		return ExcelUtil.readExcelData(filepath, "Login");
		
		
	}

}
