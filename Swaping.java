package name;
import java.util.Arrays;
import java.util.Scanner;
public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[]arr = {"Hello "	,"world"};
	StringBuilder reversed = new StringBuilder();
	for (int i = arr.length; i>0;i--) {
		reversed.append(arr[i-1]).append("");
	}
	
	String[]reversedArray = reversed.toString().split("");
	
    System.out.println(Arrays.toString(reversedArray));

	}

}
