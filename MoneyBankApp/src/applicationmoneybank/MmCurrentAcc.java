package applicationmoneybank;

import frameworkmoneybank.CurrentAcc;

public class MmCurrentAcc extends CurrentAcc {


	public MmCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
		
	}
	
	

	@Override
	public void withdraw(Float amount) {
		
		System.out.println("you withdraw from Current Acount Amount"+amount);
	}

	@Override
	public String toString() {
		return "MmCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
