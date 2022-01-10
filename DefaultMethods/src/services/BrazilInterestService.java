package services;

public class BrazilInterestService implements InterestService{

	double interestRate;
	
	public BrazilInterestService() {
		
	}

	public BrazilInterestService(double interestRate) {
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
