package name;
abstract class computer  {
 abstract void programe (); {
		System.out.println("computer has a multi programe");
	}
}
class language extends computer{
	public void java () {
		System.out.println("java is object oriented");
	}
	
	public void c () {
		System.out.println("c is low level");
	}
	
	public void python () {
		System.out.println("python is high level");
}


	void programe() {
		// TODO Auto-generated method stub
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		language l=new language();
		l.java();
		l.c();
		l.python();
	}

}
