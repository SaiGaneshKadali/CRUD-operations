package com.java.BankAcc.client;

import com.java.BankAcc.application.GSBankFactory;
import com.java.BankAcc.application.GSCurrentAcc;
import com.java.BankAcc.application.GSSavingAcc;

public class client {

	public static void main(String[] args) {
		GSBankFactory gsbankfac= new GSBankFactory();
		gsbankfac.getNewSavingAccount(0, null, 0, false);
		gsbankfac.getNewCurrentAccount(000311, "Ganesh", 10000, true);
		
		GSSavingAcc gssaving = new GSSavingAcc(000431,"Lokesh",15000,true);
		gssaving.withdraw(2000);
		
		GSCurrentAcc gscurrent = new GSCurrentAcc(000532,"Venkat",20000,true);
		gscurrent.deposit(5000);
		

	}

}