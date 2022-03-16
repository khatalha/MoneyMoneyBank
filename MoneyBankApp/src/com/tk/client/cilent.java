package com.tk.client;

import applicationmoneybank.MmBankFactory;
import frameworkmoneybank.BankFactory;
import frameworkmoneybank.CurrentAcc;
import frameworkmoneybank.SavingAcc;

public class cilent {

	public static void main(String[] args) {
		BankFactory Scammers = new MmBankFactory();
		SavingAcc user = Scammers.getNewSavingAcc(12345, "Bala", 10000.0f, false);
		CurrentAcc user2 = Scammers.getNewCurrentAccount(4578,"Vishal jolly", 4000.0f,200);
		
		System.out.println(user.toString());
		System.out.println(user2.toString());
		
		

	}

}
