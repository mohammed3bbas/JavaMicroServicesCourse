
public class SalaryRaiser {
	
	private double salary ; 
	
	

	public SalaryRaiser() {
		salary = (int) ((Math.random() * (6000 - 5000)) + 5000);
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double raisSalary() {
		double raisedSalary;
		if (salary  < 6000) {
			
			raisedSalary =  salary+ salary* 0.10;
			
		}
		else {
			raisedSalary =salary + salary*0.05; 
		}
		this.setSalary(raisedSalary);
		return raisedSalary;
		
		 
	}
	
	
	
	

}
