package com.java.shopacc.framework;

public interface ShopFactory {
public abstract PrimeAcc getNewPrimeAcc(int accno, String accname, float charges, boolean isPrime);

public abstract NormalAcc getNewNormalAcc(int acccno, String accname, float charges, float delivarycharges);

}
