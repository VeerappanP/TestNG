package com.nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInformation extends LoginNopCommerce {

	public WebElement getPrint() {
		return print;
	}

	public void setPrint(WebElement print) {
		this.print = print;
	}

	public WebElement getPdfInvoice() {
		return pdfInvoice;
	}

	public void setPdfInvoice(WebElement pdfInvoice) {
		this.pdfInvoice = pdfInvoice;
	}

	public WebElement getReorder() {
		return reorder;
	}

	public void setReorder(WebElement reorder) {
		this.reorder = reorder;
	}

	@FindBy(xpath = "//a[.='Print']")
	private WebElement print;

	@FindBy(xpath = "//a[.='PDF Invoice']")
	private WebElement pdfInvoice;

	@FindBy(xpath = "//button[.='Re-order']")
	private WebElement reorder;

}
