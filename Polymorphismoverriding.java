package name;
   class college {
	 public void departments () {
		System.out.println("college has a more departments");
	}
}
class subject extends college {
	public void three () {
	 System.out.println(" subject is three");
}

 	 public void tamil() {
 		 System.out.println("tamil is our language");
 	 }
 	 public void english() {
 		 System.out.println("english is a office language");
 	 }
 	 public void maths() {
 		 System.out.println("maths is difficult");
 	 }

	
	public void departments() {
		// TODO Auto-generated method stub
		
	} 
}
class name extends college {
	public void two() {
		System.out.println(" the college is two" );
	}
	public void artsandscience() {
		System.out.println("nisha artsand science clg");
	}	
	public void eng()	{
		System.out.println("shruthi eng clg");
	}	
		
	}

public class Polymorphismoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subject s =new subject();
		s.tamil();
		s.english();
		s.maths();
		name n = new name();
		n.artsandscience();
		n.eng();
	}

}
