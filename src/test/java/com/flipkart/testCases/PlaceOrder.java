package com.flipkart.testCases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.AddToCartPage;
import pages.DeliveryAddressPage;
import pages.LoginPage;
import pages.PlaceOrderPage;
import pages.SearchProductPage;
import pages.SelectProductPage;

import org.testng.annotations.BeforeClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
 
  @BeforeClass
  public void setUp() {
	  launchBrowser();
	  navigateToURL();
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }
  @Test(priority=1)
  public void LoginTest() {
	  LoginPage loginPage=new LoginPage();
	  boolean actResult=loginPage.validateLogin("9600239198", "MalarGokul");
	  Assert.assertTrue(actResult);
 }
  @Test(priority=2)
  public void SearchProductTest() {
	  SearchProductPage searchProductPage=new SearchProductPage();
	 boolean actResult=searchProductPage.SearchProduct("Mobiles");
	Assert.assertTrue(actResult);
 }
  @Test(priority=3)
  public void SelectProductTest() {
	  SelectProductPage selectProductPage=new SelectProductPage();
	  boolean actResult=selectProductPage.SelectProduct();
	  Assert.assertTrue(actResult);
 }
  @Test(priority=4)
  public void AddToCartTest() {
	  AddToCartPage addToCartPage=new AddToCartPage();
	  boolean actResult=addToCartPage.ValidateAddToCart();
	  Assert.assertTrue(actResult);
	  
 }
  @Test(priority=5)
  public void PlaceOrderTest() {
	  PlaceOrderPage placeOrderPage=new PlaceOrderPage();
	  placeOrderPage.ValidatePlaceOrder();	 
 }
  @Test(priority=6)
  public void DeliveryAddressTest() {
	  DeliveryAddressPage deliveryAddressPage=new DeliveryAddressPage();
	  deliveryAddressPage.validateDeliveryAddress();
 }
}
