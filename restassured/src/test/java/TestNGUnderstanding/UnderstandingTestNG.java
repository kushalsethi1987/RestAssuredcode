package TestNGUnderstanding;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class UnderstandingTestNG {
	@Test(dataProvider="DataProviderMethod")
	public void TestCase(){System.out.println("This is the test case");}
	@org.testng.annotations.BeforeClass
	public void BeforeClass(){System.out.println("This is before class");}
	@org.testng.annotations.AfterClass
	public void AfterClass(){System.out.println("This is after class");}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod(){System.out.println("This is Before Method");}
	@org.testng.annotations.AfterMethod
	public void AfterMethod(){System.out.println("This is after Method");}
	@org.testng.annotations.BeforeTest
	public void BeforeTest(){System.out.println("This is Before Test");}
	@org.testng.annotations.AfterTest
	public void AfterTest(){System.out.println("This is after test");}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite(){System.out.println("This is before Suite");}
	@org.testng.annotations.AfterSuite
	public void AfterSuite(){System.out.println("This is after Suite");}
	@org.testng.annotations.BeforeGroups
	public void BeforeGroups(){System.out.println("This is before Groups");}
	@org.testng.annotations.AfterGroups
	public void AfterGroups(){System.out.println("This is after Groups");}
	@DataProvider(name="DataProviderMethod")
	public Object[][] DataProviderMethod(){ System.out.println("Data provider is executed");return new Object[2][2];}
	
}
