package POM_JPET_TESTNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM_JPET.jpet_reg;
import POM_JPET.login;
import POM_JPET.utilities;

public class jpet_testng {
	String url="http://jpetstore.cfapps.io/accounts/create?form";	
	WebDriver dr;
	utilities a1;
	jpet_reg a2;
	login a3;
	
	
  @BeforeClass
  public void chrome() {
	  dr=a1.launch_browser("CHROME", url);
	
  }
  @Test
  public void reg() {
	  a1=new utilities(dr);
	  a2=new jpet_reg(dr);
	  a2.do_reg("balaji1", "Balaji1234", "Balaji1234", "balaji11", "dfjsd", "bal@gmail.com", "6462541512", "jdhf", "hdjf", "jhdjf", "djhf", "563456", "djhfk", "dfjid", "hfd");
	  a3=new login(dr);
	  a3.do_login("balaji", "Balaji1234");
	  String act_name=a3.getn();
	  a1.getSS();
	  Assert.assertTrue(act_name.contains("balaj"));
	  
	  
	  
  }
  
  
  
}
