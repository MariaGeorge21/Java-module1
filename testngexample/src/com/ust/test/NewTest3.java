package com.ust.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest3 {
  @Test(priority=1,description="this is exceuted")
  public void f() {
	  System.out.println("from test method f");
  }
  @Test(priority=2,description="test description")
  public void g()
  {
	  System.out.println("from test method g");
  }
  @Test(priority=3,description="then")
  public void a() {
	  System.out.println("from test method a");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
