package frameworkmoneybank;

import applicationmoneybank.MmCurrentAcc;
import applicationmoneybank.MmSavingAcc;

public  interface BankFactory {
	public MmSavingAcc getNewSavingAcc(int accNo, String accNm,  float accBal, Boolean isSalaried);
	
	public MmCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit);	

}
