package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class Commondatasetup {
  @BeforeSuite
  public void beforesuite() {
	  System.out.println("Before suite");
  }
  @AfterSuite
  public void Aftersuite() {
	  System.out.println("After suite");
  }
}
