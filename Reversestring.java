package name;
import java.util.Scanner;
public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String revstr;
		Scanner sc =new Scanner(System.in);
		System.out.println(" Enter the string");
		revstr = sc.nextLine();
		StringBuilder sb = new StringBuilder(revstr);
		System.out.println(" the result= "+sb.reverse());
	}

}
