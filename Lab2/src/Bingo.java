/** TASK 1 **/
public class Bingo {
	
	private int a ; 
	
	public Bingo() {
		a = (int) (Math.random() * 100);
	}
	
	public String isBingo() {
		
		if(a > 50) {
			return "Big!";
		}
		else if ( a < 50) {
			return "Small!";
		}
		return "Bingo!";
	}

}
