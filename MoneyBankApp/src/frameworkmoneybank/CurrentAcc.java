package frameworkmoneybank;

public abstract class CurrentAcc extends BankAcc {

	
	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, creditLimit);
		this.creditLimit = creditLimit;
				
	}
	
	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public void withdraw(Float amount) {    				//method
		
		System.out.println("You withdraw money from your Account"+amount);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
