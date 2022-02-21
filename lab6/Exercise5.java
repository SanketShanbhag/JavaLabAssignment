package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise5 {
	
	int getSecondSmallest(int[] arr){
		ArrayList<Integer> al=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			al.add(new Integer(arr[i]));
		}
		//sorting
		Collections.sort(al);
		System.out.println("After Sorting: "+al);
		int secondSmallest=al.get(1);
		return secondSmallest;
	}

	public static void main(String[] args) {
		int[] arr={10,60,8,2};
		Exercise5 e=new Exercise5();
		int result=e.getSecondSmallest(arr);
		System.out.println("the second smallest element in the array is: "+result);
		

	}

}
