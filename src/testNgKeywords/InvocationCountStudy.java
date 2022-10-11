package testNgKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount =4)
  public void a() {
	  Reporter.log("a method is running",true);
  }
  
  @AfterMethod
  public void AfterMethod()
  {
	  Reporter.log("After Method",true);
  }
}
