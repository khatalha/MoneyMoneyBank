package applicationmoneybank;

import frameworkmoneybank.SavingAcc;

public class MmSavingAcc extends SavingAcc{

	private static final float MINBAL=4000f;
	public MmSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
			
	}

	public static float getMinbal() {
		return MINBAL;
	}

	@Override
	public void withdraw(Float amount) {
		System.out.println("you withdraw  in Saving Acount Amount"+amount);
	}

	@Override
	public String toString() {
		return "MmSavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
	
	
	
	
	
	
	
	
}
