package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeadNopCommerce extends DesktopNopCommerce {

	public WebElement getLoginHead() {
		return loginHead;
	}

	public WebElement getRegisterHead() {
		return registerHead;
	}

	public WebElement getWishListHead() {
		return wishListHead;
	}

	public WebElement getShoppingCartHead() {
		return shoppingCartHead;
	}

	public WebElement getCustomerCurrencyHead() {
		return customerCurrencyHead;
	}

	public WebElement getSearchBarHead() {
		return searchBarHead;
	}

	public WebElement getSearchButtonHead() {
		return searchButtonHead;
	}

	public WebElement getComputersHead() {
		return computersHead;
	}

	public WebElement getDesktops() {
		return desktops;
	}

	public WebElement getElectronicsHead() {
		return electronicsHead;
	}

	public WebElement getApparelHead() {
		return apparelHead;
	}

	public WebElement getDigitalDownloads() {
		return digitalDownloads;
	}

	public WebElement getBooksHead() {
		return booksHead;
	}

	public WebElement getJewelryHead() {
		return jewelryHead;
	}

	public WebElement getGiftCardHead() {
		return giftCardHead;
	}

	public WebElement getGoToCartHead() {
		return goToCartHead;
	}

	@FindBy(xpath = "//a[.='Log in']")
	private WebElement loginHead;

	@FindBy(xpath = "//a[.='Register']")
	private WebElement registerHead;

	@FindBy(xpath = "//span[.='Wishlist']")
	private WebElement wishListHead;

	@FindBy(xpath = "//span[.='Shopping cart']")
	private WebElement shoppingCartHead;

	@FindBy(xpath = "//select[@id='customerCurrency']")
	private WebElement customerCurrencyHead;

	@FindBy(xpath = "//input[@id='small-searchterms']")
	private WebElement searchBarHead;

	@FindBy(xpath = "//button[.='Search']")
	private WebElement searchButtonHead;

	@FindBy(xpath = "(//a[.='Computers '])[1]")
	private WebElement computersHead;

	@FindBy(xpath = "(//a[.='Desktops '])[1]")
	private WebElement desktops;

	@FindBy(xpath = "(//a[.='Electronics '])[1]")
	private WebElement electronicsHead;

	@FindBy(xpath = "(//a[.='Apparel '])[1]")
	private WebElement apparelHead;

	@FindBy(xpath = "(//a[.='Digital downloads '])[1]")
	private WebElement digitalDownloads;

	@FindBy(xpath = "(//a[.='Books '])[1]")
	private WebElement booksHead;

	@FindBy(xpath = "(//a[.='Jewelry '])[1]")
	private WebElement jewelryHead;

	@FindBy(xpath = "(//a[.='Gift Cards '])[1]")
	private WebElement giftCardHead;

	@FindBy(xpath = "//button[.='Go to cart']")
	private WebElement goToCartHead;

}
