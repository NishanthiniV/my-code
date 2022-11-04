package name;
import java.util.Scanner;
public class Forloopreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the name");
		String name = sc.next();
		for(int i =name.length()-1;i>=0;i--) {
		System.out.print(name.charAt(i));
		}
			}
}