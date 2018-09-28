import java.util.Scanner;

public class CarPayment {
	
	private double carPrice;
	private double downPayment;
	private double lengthOfLoan;
	private double interestRate;
	
	public CarPayment(double carPrice, double downPayment, double lengthOfLoan, double interestRate)
	{
		this.carPrice=carPrice;
		this.downPayment=downPayment;
		this.lengthOfLoan=lengthOfLoan;
		this.interestRate=interestRate;
	}
	public  double monthlyCarPayment()
	{
		double price = carPrice-downPayment;
		return ((price*interestRate/12)/((1-Math.pow((1+interestRate/12),-lengthOfLoan))));
	}
	
	public double totalInterestPaid()
	{
		double price = carPrice-downPayment;
		double baseMonthPayment = price/lengthOfLoan;
		return (((price*interestRate/12)/((1-Math.pow((1+interestRate/12),-lengthOfLoan))))
				-baseMonthPayment)*lengthOfLoan;
	}
	

	


	
	}


