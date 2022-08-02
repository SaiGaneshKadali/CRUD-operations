package com.java.BankAcc.application;

import com.java.BankAcc.Framework.CurrentAcc;

public class GSCurrentAcc extends CurrentAcc {

	public GSCurrentAcc(int accno, String accname, float accBal, boolean deposit) {
		super(accno, accname, accBal, deposit);
		// TODO Auto-generated constructor stub
	}

	public void deposit (float charges) {
		System.out.println("Dear Customer your balance:" + "+accountbalance" + "deposit: " + deposit);
	}

	@Override
	public String toString() {
		return "GsCurrentAcc [accountbalance=" + accountbalance + ", accno=" + accno + ", accname=" + accname
				+ ", accBal=" + accBal + "]";
	}

}
