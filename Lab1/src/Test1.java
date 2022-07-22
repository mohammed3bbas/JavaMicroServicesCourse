import java.util.Random;

public class Test1 {
	private int a ; 
	private int b ; 
	
	public Test1() {
		a =  (int) (Math.random() * 100);
		b =  (int) (Math.random() * 100 );
		
		
	}

	public int getB() {
		return b;
	}

	public int getA() {
		return a;
	}
	
	public int sumOfNumbers() {
		return a+b ; 
	}
	
	public double avarageValue() {
		return (double) this.sumOfNumbers() / 2; 
	}
	
	public int reminderOfA(int dividor) {
		return this.a/dividor;
	}
	public int reminderOfB(int dividor) {
		return this.b/dividor;
	}
	
	public int areaOfRectangle() {
		return a*b; 
	}
	

}
