package name;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Arraylist3 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>nf= new ArrayList<Integer>();
		nf.add(22);
		nf.add(12);
		nf.add(8);
		nf.add(100);
		nf.add(17);
		nf.sort(Comparator.naturalOrder());
		System.out.println("sorted arraylist:"+nf);
	}

}
