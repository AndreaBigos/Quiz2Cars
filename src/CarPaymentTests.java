

import org.junit.jupiter.api.Test;


class CarPaymentTests {

	@Test
	public void monthlyCarPayment_test1()
	{
		double carPrice =30000;
		double downPayment = 1000;
		double lengthOfLoan = 36;
		double interestRate = 0.1;
		CarPayment c = new CarPayment(carPrice,downPayment,lengthOfLoan,interestRate);
		System.out.println(c.monthlyCarPayment());
	}
	
	@Test
	public void monthlyCarPayment_test2()
	{
		double carPrice =40000;
		double downPayment = 0;
		double lengthOfLoan = 72;
		double interestRate = 0.15;
		CarPayment c = new CarPayment(carPrice,downPayment,lengthOfLoan,interestRate);
		System.out.println(c.monthlyCarPayment());
	}
	
	@Test
	public void monthlyCarPayment_test3()
	{
		double carPrice =45000;
		double downPayment = 500;
		double lengthOfLoan = 60;
		double interestRate = 0.2;
		CarPayment c = new CarPayment(carPrice,downPayment,lengthOfLoan,interestRate);
		System.out.println(c.monthlyCarPayment());
	}
	
	@Test
	public void totalInterestPaid_test1()
	{
		double carPrice =40000;
		double downPayment = 0;
		double lengthOfLoan = 72;
		double interestRate = 0.15;
		CarPayment c = new CarPayment(carPrice,downPayment,lengthOfLoan,interestRate);
		System.out.println(c.totalInterestPaid());
	}
	
	@Test
	public void totalInterestPaid_test2()
	{
		double carPrice =40000;
		double downPayment = 0;
		double lengthOfLoan = 72;
		double interestRate = 0.15;
		CarPayment c = new CarPayment(carPrice,downPayment,lengthOfLoan,interestRate);
		System.out.println(c.totalInterestPaid());
	}
	
	@Test
	public void totalInterestPaid_test3()
	{
		double carPrice =45000;
		double downPayment = 500;
		double lengthOfLoan = 60;
		double interestRate = 0.2;
		CarPayment c = new CarPayment(carPrice,downPayment,lengthOfLoan,interestRate);
		System.out.println(c.totalInterestPaid());
	}

}
