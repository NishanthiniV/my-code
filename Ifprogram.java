package name;
import java.util.Scanner;
public class Ifprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		if (num>100) {
		
			System.out.print(num+"is greater than 100");
	     }
		else {
			System.out.print(num+"is smaller than 100");
         }
	  }
 } 