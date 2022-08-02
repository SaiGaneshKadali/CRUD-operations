package com.java.BankAcc.application;

import com.java.BankAcc.Framework.BankFactory;
import com.java.BankAcc.Framework.CurrentAcc;
import com.java.BankAcc.Framework.SavingAcc;

public class GSBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accname, float accBal, boolean withdraw) {
		GSSavingAcc gssaving = new GSSavingAcc(accno, accname, accBal, withdraw);
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal, boolean deposit) {
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accno, String accname, float accBal, boolean deposit) {
		// TODO Auto-generated method stub
		return null;
	}

}
