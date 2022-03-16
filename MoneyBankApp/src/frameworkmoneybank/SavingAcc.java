package frameworkmoneybank;

public abstract class SavingAcc extends BankAcc{

	
	private boolean isSalaried;
	private static final float MINBAL = 5000.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);	
		this.isSalaried= isSalaried;
		
	}
	
	
		
	public boolean isSalaried() {
		return isSalaried;
	}



	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}



	public static float getMinbal() {
		return MINBAL;
	}



	@Override  						//method
	public void withdraw(Float amount) {
		System.out.println("You withdraw money from your Account"+amount);
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", accNo=" + accNo + ", accNm=" + accNm + ", getAccNo()="
				+ getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	

}
