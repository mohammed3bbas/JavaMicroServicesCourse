
public class TaxCalculator {
	
	private double salary ; 
	
	public TaxCalculator(double salary) {
		this.setSalary(salary);
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public double calculateTax() {
		double salaryWithTax ;
		if(salary < 0) {
			return -1 ; 
		}
		if(salary <= 23000) {
			salaryWithTax = salary + salary*0.10;
		}
		else if(salary <= 50000) {
			salaryWithTax = salary + salary*0.20;
		}
		else if(salary <= 100000) {
			salaryWithTax = salary + salary*0.30;
		}
		else {	
			salaryWithTax = salary + salary*0.40;
		}
		
		return salaryWithTax;
		
		
		
	}

}
