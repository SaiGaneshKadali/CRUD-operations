package com.java.BankAcc.application;

import com.java.BankAcc.Framework.SavingAcc;

public class GSSavingAcc extends SavingAcc {
	
	private static final float accountbalance = 20000;

	public GSSavingAcc(int accno, String accname, float accBal,boolean withdraw) {
		super(accno, accname, accBal, withdraw);
		// TODO Auto-generated constructor stub
	}

    public void withdraw(float accBal) {
		System.out.println("Dear Customer,your Accountbal:"+ accountbalance);
	}
    public void deposit(float accBal) {
    	System.out.println("Dear Customer,your Acccountbal:"+ accountbalance);
    }

	@Override
	public String toString() {
		return "GSSavingAcc [accno=" + accno + ", accname=" + accname + ", accBal=" + accBal + "]";
	}
	
	
	

}
