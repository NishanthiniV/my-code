package name;
import java.util.Scanner;
public class Stringscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n =new Scanner(System.in);
		System.out.println("Enter the user name");
		String Username = n.nextLine();
		System.out.println("username:"+Username);	
		int age;
		Scanner sc=new Scanner(System.in);
		if(sc.hasNextInt())
		
		System.out.println(sc.nextInt()+"It is Integer");
		
		else
		
			System.out.println(sc.nextLine()+"It is not a Integer");
		
	}
		

}
