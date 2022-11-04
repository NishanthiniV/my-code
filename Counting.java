package name;
import java.util.Scanner;
public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,len;
		String str;
		int counter[] = new int [256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		str =sc.next();
		len = str.length();
		
	
		for( i=0;i<len;i++)
		
		{
			counter[(int)str.charAt(i)]++;
		}
		for(i=0;i<256;i++)
		{
		if (counter[i]!=0)
		{	
			System.out.println((char)i+ " ="+counter[i]);
		}
	}	
} 
}