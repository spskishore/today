package POM_JPET;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class jpet_reg {
	
	WebDriver dr;
	static utilities wt;
	public  jpet_reg(WebDriver dr)
	{this.dr=dr;
	wt= new utilities(dr);
}
	
	
	By uid= By.xpath("//form[@action='/accounts/create']/table/tbody/tr[1]/td/input");
	By pwd= By.xpath("//form[@action='/accounts/create']/table/tbody/tr[2]/td/input");
	By rpwd= By.xpath("//form[@action='/accounts/create']/table/tbody/tr[3]/td/input");
	By FN= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[1]/td/input");
	By LN= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[2]/td/input");
	By EM= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[3]/td/input");
	By PN= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[4]/td/input");
	By AD1= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[5]/td/input");
	By AD2= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[6]/td/input");
	By CITY= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[7]/td/input");
	By STATE= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[8]/td/input");
	By ZIP= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[9]/td/input");
	By COUNTRY= By.xpath("//div[@id='Catalog']/form/div/table/tbody/tr[10]/td/input");
	By LP= By.xpath("//div[@id='Catalog']/form/div/table[2]/tbody/tr[1]/td[2]/select");
	By FC= By.xpath("//div[@id='Catalog']/form/div/table[2]/tbody/tr[2]/td[2]/select");
	By EML= By.xpath("//div[@id='Catalog']/form/div/table[2]/tbody/tr[3]/td[2]/input[1]");
	By EMB= By.xpath("//div[@id='Catalog']/form/div/table[2]/tbody/tr[4]/td[2]/input[1]");
	By SAI= By.xpath("//div[@id='Catalog']/form/input[2]");
	

	

	public void set_uid(String un)
	{
		WebElement we_uid=wt.waitForElement(uid, 10);
		we_uid.sendKeys(un);
	}
	
	public void set_pwd(String pd)
	{
		WebElement we_pwd=wt.waitForElement(pwd, 10);
		we_pwd.sendKeys(pd);
	}
	
	public void set_rpwd(String rpd)
	{
		WebElement we_rpwd=wt.waitForElement(rpwd, 10);
		we_rpwd.sendKeys(rpd);
	}
	
	public void set_fn(String fn)
	{
		WebElement we_fn=wt.waitForElement(FN, 10);
		we_fn.sendKeys(fn);
	}
	
	public void set_ln(String ln)
	{
		WebElement we_ln=wt.waitForElement(LN, 10);
		we_ln.sendKeys(ln);
	}
	
	public void set_em(String em)
	{
		WebElement we_em=wt.waitForElement(EM, 10);
		we_em.sendKeys(em);
	}
	
	public void set_pn(String pn)
	{
		WebElement we_pn=wt.waitForElement(PN, 10);
		we_pn.sendKeys(pn);
	}
	
	public void set_ad1(String ad1)
	{
		WebElement we_ad1=wt.waitForElement(AD1, 10);
		we_ad1.sendKeys(ad1);
	}
	
	public void set_ad2(String ad2)
	{
		WebElement we_ad2=wt.waitForElement(AD2, 10);
		we_ad2.sendKeys(ad2);
	}
	
	public void set_ct(String ct)
	{
		WebElement we_ct=wt.waitForElement(CITY, 10);
		we_ct.sendKeys(ct);
	}
	
	public void set_st(String st)
	{
		WebElement we_st=wt.waitForElement(STATE, 10);
		we_st.sendKeys(st);
	}
	
	public void set_zp(String zp)
	{
		WebElement we_zp=wt.waitForElement(ZIP, 10);
		we_zp.sendKeys(zp);
	}
	
	public void set_cnt(String cnt)
	{
		WebElement we_cnt=wt.waitForElement(COUNTRY, 10);
		we_cnt.sendKeys(cnt);
	}
	
	public void set_lp(String lp)
	{
		WebElement we_lp=wt.waitForElement(LP, 10);
		Select sel1=new Select((WebElement) we_lp);
		sel1.selectByVisibleText("English");
	}
	
	public void set_fc(String fc)
	{
		WebElement we_lp=wt.waitForElement(FC, 10);
		Select sel2=new Select((WebElement) we_lp);
		sel2.selectByVisibleText("FISH");
	}
	
	public void set_eml()
	{
		WebElement we_eml=wt.waitForElement(EML, 10);
		we_eml.click();
	}
	
	public void set_emb()
	{
		WebElement we_emb=wt.waitForElement(EMB, 10);
		we_emb.click();
	}
	
	public void set_sai()
	{
		WebElement we_sai=wt.waitForElement(SAI, 10);
		we_sai.click();
	}
	
	
	
	
	
	public void do_reg(String a,String b,String c,String d,String e,String f,String i,String j,String k,String l,String m,String n,String o, String p, String q)
	{
		this.set_uid(a);
		this.set_pwd(b);
		this.set_rpwd(c);
		this.set_fn(d);
		this.set_ln(e);
		this.set_em(f);
	    this.set_pn(i);
		this.set_ad1(j);
		this.set_ad2(k);
		this.set_ct(l);
		this.set_st(m);
		this.set_zp(n);
		this.set_cnt(o);
		this.set_lp(p);
		this.set_fc(q);
		this.set_eml();
		this.set_emb();
		this.set_sai();
		
		
		
	}
	
}
