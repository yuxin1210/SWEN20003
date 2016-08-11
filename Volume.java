
public class Volume {

	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]);
		System.out.println("The volume of a sphere of radius " + r + " is: " + calculateVolume(r));
		System.out.printf("The volume of a sphere of radius %.3f is %.3f\n",r,calculateVolume(r));
		// TODO Auto-generated method stub

	}
	
	public static double calculateVolume(double r){
		double volume = 4/3 * Math.PI * r * r * r;
		
		return volume;
	}

}
