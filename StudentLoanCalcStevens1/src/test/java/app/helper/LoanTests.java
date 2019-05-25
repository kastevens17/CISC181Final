package app.helper;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoanTests {
	//Everything's kind of out of order
	@Test
	public void TestPrincipal1() {
		double interestRate = 0.10;
		int lengthOfLoan = 5;
		double loanAmount = 75497;

		double additionalPayment = 0;
		
		Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
		assertEquals(loan.addPrincipal() , loanAmount, 1.0);}
	
	@Test
	public void InterestTest() {
		double loanAmount = 10000;
		double interestRate = 0.01;
		int lengthOfLoan = 10;
		double additionalPayment = 0;
		Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
		double expectedValue = 585.85;
		assertEquals(loan.addInterest() , expectedValue, .5);
	}

	
	@Test
	public void LoanTest2() {
		double loanAmount = 200000;
		double interestRate = 0.20;
		int lengthOfLoan = 10;
		double additionalPayment = 300;
		
		Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
		double expectedValue = 280953.58;
		assertEquals(loan.addPayments() , expectedValue, .5);
	}
	
	@Test
	public void PrincipalTest2() {
		double loanAmount = 80000;
		double interestRate = 0.10;
		int lengthOfLoan = 15;
		double additionalPayment = 270;
		
		Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
		assertEquals(loan.addPrincipal() , loanAmount, .1);
	}

	@Test
	public void InterestTest2() {
		double loanAmount = 100000;
		double interestRate = 0.10;
		int lengthOfLoan = 10;
		double additionalPayment = 300;
		
		Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
		double expectedValue = 40953.58;
		assertEquals(loan.addInterest() , expectedValue, .5);
	}
	
	
	@Test
	public void LoanTest() {
		double interestRate = 0.10;
		int lengthOfLoan = 10;
		double additionalPayment = 0;
		double loanAmount = 100000;

		Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
		double expectedValue = 158580.53;
		
		assertEquals(loan.addPayments() , expectedValue, 1.0);
	}
	

	
@Test
public void LoanTest1() {
	double loanAmount = 100000;
	double interestRate = 0.10;
	int lengthOfLoan = 10;
	double additionalPayment = 200;
	
	Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
	double expectedValue = 145466.59;
	assertEquals(loan.addPayments() , expectedValue, .5);
}

@Test
public void PrincipalTest1() {
	double loanAmount = 100000;
	double interestRate = 0.10;
	int lengthOfLoan = 10;
	double additionalPayment = 200;
	
	Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
	assertEquals(loan.addPrincipal() , loanAmount, .1);
}

@Test
public void InterestTest1() {
	double loanAmount = 100000;
	double interestRate = 0.10;
	int lengthOfLoan = 10;
	double additionalPayment = 200;
	
	Loan loan = new Loan(loanAmount, interestRate, lengthOfLoan, additionalPayment);	
	double expectedValue = 45466.59;
	assertEquals(loan.addInterest() , expectedValue, .5);
}}
