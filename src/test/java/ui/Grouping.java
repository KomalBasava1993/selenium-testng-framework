package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.Commondatasetup;

@Test(groups= {"Usercalss"})
public class Grouping extends Commondatasetup {
	 @Test(groups= {"regression"})
	  public void f1() {
		  System.out.println("f1");
	  }
	  @Test(groups= {"regression","kvb"})
	  public void f2() {
		  System.out.println("f2");
	  }
	  @Test(groups= {"regression"})
	  public void f3() {
		  System.out.println("f3");
	  }
	  @Test(groups= {"regression","kvb"})
	  public void f4() {
		  System.out.println("f4");
	  }
	  @Test(groups= {"smoke"})
	  public void f5() {
		  System.out.println("run this f5");
	  }
	  @BeforeClass
	  public void f6() {
		  System.out.println("Before class");
	  }
	  @AfterClass
	  public void f8() {
		  System.out.println("After calss");
	  }
	  @BeforeGroups(value="smoke")
	  public void f9() {
		  System.out.println("Run this smoke");
	  }
	  @AfterGroups(value="smoke")
	  public void f10() {
		  System.out.println("Run this smoke");
	  }
	  @BeforeTest
	  public void f12() {
		  System.out.println("Before Test komal");
	  }
		  @AfterTest
		  public void f13() {
			  System.out.println("After test komal");
}
}
