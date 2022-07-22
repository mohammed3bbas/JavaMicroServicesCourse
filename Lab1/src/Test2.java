
public class Test2 {
	
	private double minutes ;
	
	
	public Test2() {
		minutes =  (Math.random() * (350 - 100)) + 100;
	}


	public double getMinutes() {
		return minutes;
	}
	
	public String hoursAndMinutes() {
		return "Hours: " + minutes / 60 + " Minutes: " + minutes % 60 ;  
	}
	
	

}
