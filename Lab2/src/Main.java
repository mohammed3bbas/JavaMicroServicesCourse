
public class Main {

	public static void main(String[] args) {
		Bingo b = new Bingo();
		System.out.println(b.isBingo());

		/************************/
		CustomComprator c = new CustomComprator();
		System.out.println(c.compare());
		
		/**************/
		
		SalaryRaiser sr = new SalaryRaiser();
		System.out.println(sr.getSalary());
		System.out.println( sr.raisSalary() );
		
		/*************/
		
		BigestRandom bRand = new BigestRandom();
		System.out.println(bRand.largestRandom());
		
		/**************/
		SmallestRandom sRand = new SmallestRandom();
		System.out.println(sRand.smallesttRandom());
		
		/**************/
		
		TaxCalculator tc = new TaxCalculator(Math.random() * 100000);
		System.out.println("salary before tax = "+tc.getSalary());
		System.out.println("salary after tax= " + tc.calculateTax());
		
		/**************/
		
		
		System.out.println(LeapYearClaculator.isLeapYear((int) (Math.random() * 10000)));
		
		

		
	}

}
