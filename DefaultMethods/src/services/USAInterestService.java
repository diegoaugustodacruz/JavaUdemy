package services;

public class USAInterestService implements InterestService{

	double interestRate;
	
	public USAInterestService() {
		
	}

	public USAInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
