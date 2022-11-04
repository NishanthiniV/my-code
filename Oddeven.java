package name;
import java.util.Scanner;
public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number: ");
		number = sc.nextInt();
		if(number% 2 ==0)
		System.out.print(number +"is even number");
		else
		{
		System.out.print(number+"is odd number");
	}
	  }
}
