
public class ConvertSeconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sec = Integer.parseInt(args[0]);
		int seconds = computeSec(sec);
		int hours = computeHour(sec);
		int mins = computeMin(sec,hours);
		System.out.println(hours + " hours, " + mins + " minutes, " + seconds + " seconds.");
	

	}
	
	public static int computeSec(int sec){
		int seconds = (sec % 60) % 60;
		return seconds;
	}
	
	public static int computeHour(int sec){
		int hours = sec / 3600;
		return hours;
	}
	
	public static int computeMin(int sec, int hours){
		int mins = sec/60 - hours * 60;
		return mins;
	}

}
