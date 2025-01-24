package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class CalenderHelper extends BaseClass {

	public static void handleMonthYear(WebElement Month, String ExpMonth, WebElement Year, String ExpYear,
			WebElement nextbtn)

	{
		while (true) {
			String cmonth = Month.getText();
			String cyear = Year.getText();

			if (cmonth.contains(ExpMonth) && cyear.contains(ExpYear)) {
				break;
			} else {
				WebElementHelper.click(nextbtn);
			}

		}
	}

	public static void handleDate(List<WebElement> allList, String ExpDate) {
		for (WebElement aa : allList) {
			String dates = aa.getText();
			if (dates.contains(dates)) {
				WebElementHelper.click(aa);
				break;
			}

		}
	}

}
