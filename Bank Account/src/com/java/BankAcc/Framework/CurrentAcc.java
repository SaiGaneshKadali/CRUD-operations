package com.java.BankAcc.Framework;

public class CurrentAcc extends BankAcc {
	public boolean deposit;
	
    public final float accountbalance=1000;
    
	public CurrentAcc(int accno, String accname, float accBal, boolean deposit) {
		super(accno, accname, accBal, deposit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CurrentAcc [accountbalance=" + accountbalance + ", accno=" + accno + ", accname=" + accname
				+ ", accBal=" + accBal + "]";
	}

	

	
}