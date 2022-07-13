package testNgKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutUse {
  @Test(timeOut = 2000)

  public void a () throws InterruptedException
  {Thread.sleep(300);
	  Reporter.log("a Method",true);
  }
  
  @Test
  public void  b() 
  {
	Reporter.log("b Method",true);  
  }
  
  @Test
  public void c()
  {
	  Reporter.log("c method",true);
  }
 
}

