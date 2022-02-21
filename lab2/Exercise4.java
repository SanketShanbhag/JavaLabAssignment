import java.util.Scanner;

public class Exercise4 {
	
	static int[] modifyArray(int[] array){
		//removing the duplicates
		int n=array.length;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(array[i]==array[j]){
					int k=j;
					while(k<n-1){
						array[k]=array[k+1];
						k++;
					}
					n--;
				}
			}
			
		}
		int[] new_array=new int[n];
		for(int i=0;i<n;i++){
			new_array[i]=array[i];
		}
		System.out.println("After deleting the duplicate the new array is:");
		for(int i=0;i<n;i++){
			System.out.print(new_array[i]+" ");
		}
		System.out.println();
		
		//Sorting the new array in descending after deleting duplicates
		int temp=0;
		for (int i = 0; i <n; i++) {     
            			for (int j = i+1; j <n; j++) {     
               				if(new_array[i] < new_array[j]) {    
                   			temp = new_array[i];    
                   			new_array[i] = new_array[j];    
                   			new_array[j] = temp;    
               				}     
           			}     
        		}
		return new_array;	
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
		
		int[] result=modifyArray(array);
		System.out.println("Resulting array after sorting in descending is: ");
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}

}