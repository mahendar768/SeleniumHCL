package com.TandooriDemoTestcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.TandooriDemoBasePage.TandooriBase;
import com.TandooriDemoPages.TandooriPaymentPage;

public class TandooriPaymentTest extends TandooriBase {
 
	 TandooriPaymentPage payment;
	public TandooriPaymentTest() throws IOException {
		super();
		payment = new TandooriPaymentPage();
		
	}
		@Test
		public void verify_pay() {
		
			payment.payment();
			System.out.println("Verify_pay executed..");
	
}
}