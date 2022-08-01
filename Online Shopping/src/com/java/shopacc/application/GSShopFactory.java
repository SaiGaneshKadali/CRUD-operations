package com.java.shopacc.application;
 
import com.java.shopacc.framework.NormalAcc;
import com.java.shopacc.framework.PrimeAcc;
import com.java.shopacc.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int accno, String accname, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accno, accname, charges, isPrime);
		
		return null;
	}

	@Override
	public NormalAcc getNewNormalAcc(int acccno, String accname, float charges, float delivarycharges) {
		float delevirycharges = 0;
		GSNormalAcc gsnormal = new GSNormalAcc(acccno, accname, delevirycharges, delevirycharges);
		return null;
	}

	

}