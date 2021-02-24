package model.servicies;

public class PayPalService implements OnlinePaymentService{

	@Override
	public double paymentFee(double amount) {
		// TODO Auto-generated method stub
		return amount*0.01;
	}

	@Override
	public double interest(double amount, int months) {
		// TODO Auto-generated method stub
		return amount*0.02*months;
	}

	
	
}
