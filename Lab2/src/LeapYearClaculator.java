
public class LeapYearClaculator {
	
	
	public static String isLeapYear(int year) {	
		if(( year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0) {
			return "year " +year+ " is a Leap year";
		}
		return "year " +year+ " isn't a Leap year";
	}

}
