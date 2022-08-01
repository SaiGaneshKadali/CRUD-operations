package com.java.shopacc.client;

import com.java.shopacc.application.GSShopFactory;
import com.java.shopacc.application.GSPrimeAcc;
import com.java.shopacc.application.GSNormalAcc;

public class client {

	public static void main(String[] args) {
		
		GSShopFactory gsshop = new GSShopFactory();
		gsshop.getNewPrimeAcc(0, null, 0, false);
		gsshop.getNewNormalAcc(2051024,"Ganesh",22134, 54);
		
		GSPrimeAcc gsprime=new GSPrimeAcc(2051123,"Lokesh",28713, true);
		gsprime.bookproduct(4999);
		
		GSNormalAcc gsnormal=new GSNormalAcc(2052221,"Venkat",78432,51);
		gsnormal.bookproduct(500);
		
		gsprime.toString();
		gsnormal.toString();
  
	}


}