
public class BigestRandom {
	
	private double a ; 
	private double b ; 
	private double c ; 
	
	public BigestRandom() {
		a =  Math.random();
		b =  Math.random();
		c = Math.random();
	}
	
	public double largestRandom() {
		
		if(a > b && a > c) {
			return a ;
		}
		else if(b > a && b > c) {
			return b ;
		}
		return c ;
	}
	
	

}
