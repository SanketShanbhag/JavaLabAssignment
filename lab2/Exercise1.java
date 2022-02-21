import java.util.Scanner;
public class Exercise1 {
	static int getSecondSmallest(int[] array){
		
		//sorting
		for (int i = 0; i < array.length; i++){  
			for (int j = i + 1; j < array.length; j++){  
				int tmp = 0;  
				if (array[i] > array[j]){  
					tmp = array[i];  
					array[i] = array[j];  
					array[j] = tmp;  
				}
			}
			
		}  
		int second_smallest_element=array[1];
		return second_smallest_element ;
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the size of  array= ");
		int size=scn.nextInt();
		int[] array = new int[size];
		System.out.println("enter the "+size+" array elements:");
		for(int i=0;i<size;i++){
			array[i]=scn.nextInt();
		}
		scn.close();
		int result=getSecondSmallest(array);
		System.out.println("Second Smallest emelemt is: "+result);
		
		

	}

}