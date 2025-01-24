package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class DropDownHelper extends BaseClass {

	public static void dropdownHandle(List<WebElement> allList, String Value) {
		for (WebElement aa : allList) {
			String dropvalue = aa.getText();

			if (dropvalue.contains(Value)) {

				WebElementHelper.click(aa);
				break;
			}

		}
	}

}
