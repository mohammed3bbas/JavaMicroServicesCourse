
public class Printer {
	private String part1 = "There will be";
	private int vistors = 5 ; 
	private String part2 = "people for dinner";
	
	
	
	public int getVistors() {
		return vistors;
	}
	public void setVistors(int vistors) {
		this.vistors = vistors;
	}
	
	
	
	public void print() {
		System.out.println(part1 + " " + vistors + " " + part2 );
	}

}
