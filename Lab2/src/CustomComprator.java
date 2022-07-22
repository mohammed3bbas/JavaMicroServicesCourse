/**TASK 2 **/
public class CustomComprator {

	private int a ; 
	
	public CustomComprator() {
		a = (int) (Math.random() * 100);
	}
	
	public String compare() {
		
		if (a > 50 && a%2 ==0 ) {
			return "Big and Even";
		}
		else if( a > 50 ) {
			return "Big and odd";
		}
		else if(a < 50 && a%2 == 0 ) {
			return "Small and Even";
		}
		else if (a < 50) {
			return "Small and Odd";
		}
		return "it 50 :) " ;
		
		
		
	}
}
