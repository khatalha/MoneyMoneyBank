package applicationmoneybank;

import frameworkmoneybank.BankFactory;
import frameworkmoneybank.CurrentAcc;
import frameworkmoneybank.SavingAcc;

public class MmBankFactory implements BankFactory {

	@Override
	public MmSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, Boolean isSalaried) {

		return new MmSavingAcc(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public MmCurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		
		return new MmCurrentAcc(accNo, accNm, accBal, creditLimit);
	}

}
