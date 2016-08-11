import java.util.*;
public class PredictHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double childHeight = 0;
		double motherHeight = 0;
		double fatherHeight = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the gender of the child: ");
		//System.out.println("Enter the height of mother in inches: ");

		while(in.hasNext()){
			String gender = in.nextLine();
			System.out.println(gender);
			System.out.println("Enter the height of the mother: ");
			if(in.hasNextDouble()){
				motherHeight = in.nextDouble();
			}
			else{
				System.out.println("Error");
				System.exit(1);
			}
			
			System.out.println("Enter the height of the father: ");
			if(in.hasNextDouble()){
				fatherHeight = in.nextDouble();
			}
			else{
				System.out.println("Error");
				System.exit(1);
			}
			
			if(gender.equals("male")){
				childHeight = 0.5* ((motherHeight * 13/12) + fatherHeight);
			}
			else if(gender.equals("female")){
				childHeight = 0.5* ((fatherHeight * 13/12) + motherHeight);
			}
			System.out.printf("The estimated adult height of child in inches is: %.2f inches",childHeight);
		}
			
	}
	

}
