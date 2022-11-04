package name;
class Human {
	public void eat() {
		System.out.println("Human can eat");
	}
}
 class male extends Human{
	 public void eat() {
		 super.eat();
		 System.out.println("male can eat");
	 }
	 public void speak() {
		 System.out.println("male can speak");
	 }
 }
 class female extends Human{
	public void eat() {
		super.eat();
		System.out.println("female can eat");
	}
	public void cook() {
		System.out.println("female can cook");
	}
 }
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		male m = new male ();
		m.eat();
		m.speak();
		female f= new female();
		f.eat();
		f.cook();
	}

}
