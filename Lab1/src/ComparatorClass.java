
public class ComparatorClass {
	private double a ; 
	private double b ; 
	
	
	public ComparatorClass() {
		a = Math.random();
		b = Math.random();
	}
	
	
	public double getA() {
		return a;
	}



	public double getB() {
		return b;
	}



	public double getLarger() {
		return Math.max(a, b);
	}

}
