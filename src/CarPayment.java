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
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your total price of car: ");
		double carPrice = s.nextDouble();
		System.out.print("Enter your down Payment: ");
		double downPayment = s.nextDouble();
		System.out.print("Enter your length of loan: ");
		double lengthOfLoan = s.nextDouble();
		System.out.print("Enter your interest rate: ");
		double interestRate = s.nextDouble();
		
		CarPayment pay = new CarPayment(carPrice, downPayment, lengthOfLoan, interestRate);
		System.out.println(pay.monthlyCarPayment());
		System.out.println(pay.totalInterestPaid());
	}


	
	}


