
public class PeriodToPay {

	public static void main(String[] args) {
		
		final double interestRate = 0.015;
		double debt = 1000;
		double interest = interestRate * debt;
		int month = 0;
		int payment = 50;

		while(debt>0){
			month++;
			debt -= payment - interest;
			System.out.println(debt);
			interest = interestRate * debt;

			
		}
		System.out.println("Period to Pay: " + month);
	}

}
