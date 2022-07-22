
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		p.print();
		
		/******************/
		p.setVistors( p.getVistors() +2 );
		p.print();
		
		/*****************/
		
		Test1 t1 = new Test1();
		System.out.println(t1.getA());
		System.out.println(t1.getB());
		System.out.println(t1.avarageValue());
		System.out.println(t1.reminderOfA(10));
		System.out.println(t1.reminderOfB(10));
		System.out.println(t1.areaOfRectangle());
		
		/****************/
		
		Test2 t2 = new Test2();
		System.out.println("Minutes : "+ t2.getMinutes());
		System.out.println(t2.hoursAndMinutes());
		/****************/
		
		ComparatorClass c = new ComparatorClass();
		
		System.out.println("a= " + c.getA() +" b= " +c.getB());
		System.out.println("the larger value= " + c.getLarger());
		
		
		
		
		
		


	}

}
