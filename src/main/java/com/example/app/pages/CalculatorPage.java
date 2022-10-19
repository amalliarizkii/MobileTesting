package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

    public String getResult() {
    return getText(MobileBy.id("tv_result"));
    }

    public boolean checkResult() {
    By locator = MobileBy.id("tv_result");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement ResultBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return ResultBtn.isDisplayed();
  }

  public void inputNumber1(int number1){
    type(MobileBy.id("et_1"),(Integer.toString(number1)));
  }

  public void clickDropDown(){
    click(MobileBy.id("spinner_1"));
  }

  public void clickMultipleButton(){
    click(MobileBy.xpath("//android.widget.TextView[@text='*']"));
  }

  public void inputNumber2(int number2){
    type(MobileBy.id("et_2"),(Integer.toString(number2)));
  }

  public void clickEqualButton(){
    click(MobileBy.id("acb_calculate"));
  }


}
