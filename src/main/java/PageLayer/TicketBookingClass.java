package PageLayer;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.CalenderHelper;
import UtilityLayer.WebElementHelper;

public class TicketBookingClass extends BaseClass{

@FindBy(xpath="//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']/child::input")
private WebElement from;


@FindBy(xpath="//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/child::input")
private WebElement to;

@FindBy(xpath="//span[@class='ng-tns-c58-10 ui-calendar']/child::input")
private WebElement calClick;

@FindBy(xpath="//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']")
private WebElement month;

@FindBy(xpath="//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']")
private WebElement year;

@FindBy(xpath="//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")
private WebElement nextbtn;

@FindBys(@FindBy(xpath="//td[@class='ng-tns-c58-10 ng-star-inserted']"))
private List<WebElement> allDate;

@FindBy(xpath="//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")
private WebElement allClassClick;

@FindBys(@FindBy(xpath="//li[@class='ui-dropdown-item ui-corner-all']"))
private List<WebElement> allClassList;

@FindBy(xpath="//div[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']")
private WebElement generalClick;

@FindBys(@FindBy(xpath="//li[@class='ui-dropdown-item ui-corner-all']"))
private List<WebElement> generalList;

@FindBy(xpath="//button[text()='Search']")
private WebElement searchbtn;


public TicketBookingClass()
{
	 PageFactory.initElements(getDriver(),this);
}

public void enterFrom(String From)
{
	WebElementHelper.sendKeys(from, From);	
}


public void enterTo(String To)
{
	WebElementHelper.sendKeys(to, To);	
}

public void enterMonthAndYear(String Month, String Year)
{
	CalenderHelper.handleMonthYear(month, Month, year, Year, nextbtn);
}

public void enterDate(String Date)
{
	CalenderHelper.handleDate(allDate, Date);
	}



}
