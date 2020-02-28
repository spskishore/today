package POM_JPET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	WebDriver dr;
	static utilities wt;
	public  login(WebDriver dr)
	{this.dr=dr;
	wt= new utilities(dr);
}
	
	
	By uname= By.xpath("//form[@action='/login']/p[2]/input[1]");
	By pword= By.xpath("//form[@action='/login']/p[2]/input[2]");
	By login= By.xpath("//form[@action='/login']/input[2]");
	By getname= By.xpath("//div[@id='WelcomeContent']/div/span");
	
	
	
	public void set_uname1(String uname1)
	{
		WebElement we_uname1=wt.waitForElement(uname, 10);
		we_uname1.sendKeys(uname1);
	}
	
	public void set_pword(String pw)
	{
		WebElement we_pw=wt.waitForElement(pword, 10);
		we_pw.sendKeys(pw);
	}
	public void set_login()
	{
		WebElement we_lg=wt.waitForElement(login, 10);
		we_lg.click();
	}
	
	public String getn()
	{
		WebElement we_gn=wt.waitForElement(getname, 10);
		return we_gn.getText();
	}

	
	
	
	public void do_login(String a, String b) {
		
		
		
	this.set_uname1(a);
	this.set_pword(b);
	this.set_login();


}
	
}
