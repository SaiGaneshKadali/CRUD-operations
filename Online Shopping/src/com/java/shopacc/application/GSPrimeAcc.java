package com.java.shopacc.application;

import com.java.shopacc.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {

	private static final float charges=0;
	
	public GSPrimeAcc(int accno, String accname, float charges, boolean isPrime) {
		super(accno, accname, charges, isPrime);
		
	}
	

	@Override
	public void bookproduct(float charges) {
		System.out.println("Dear prime user,your product charges: "+charges);
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
	}
	

}