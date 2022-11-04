package name;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		number=sc.nextInt();
		if(number>0)
		{
			System.out.print("The number is positive");
		}
		else if  (number<0) 
		{ 		
		    System.out.print("The number is negative");
		}
	}

}
