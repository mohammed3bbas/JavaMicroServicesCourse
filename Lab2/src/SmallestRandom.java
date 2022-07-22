
public class SmallestRandom {
	private double a ; 
	private double b ; 
	private double c ; 
	
	public SmallestRandom() {
		a =  Math.random();
		b =  Math.random();
		c = Math.random();
	}
	
	public double smallesttRandom() {
		
		if(a < b && a < c) {
			return a ;
		}
		else if(b < a && b < c) {
			return b ;
		}
		return c ;
	}
	
}
