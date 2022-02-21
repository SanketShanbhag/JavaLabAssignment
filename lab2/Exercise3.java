public class Exercise3 {
	static int[] getSorted(int[] array){
		
		//reversing
		int[] reverse=new int[array.length];
		int a = array.length;
        		for (int i = 0; i <array.length; i++) {
           			 reverse[a - 1] = array[i];
            			a = a-1;
      		 }
       		 System.out.println("Reversed array numbers are:");
       		 for(int i=0;i<reverse.length;i++){
        		System.out.print(" "+reverse[i]);
        		}
       		 System.out.println();
        
        		//sorting the reversed numbers
        		int[] sort=reverse;
       		for (int i = 0; i <sort.length; i++){  
			for (int j = i + 1; j <sort.length; j++){  
				int tmp = 0;  
				if (sort[i] >sort[j]){  
					tmp = sort[i];  
					sort[i] = sort[j];  
					sort[j] = tmp;  
				}
			}
			
		}
		return sort;
	}

	public static void main(String[] args) {
		
		int[] array={88,39,100,5,11};
		int[] result=getSorted(array);
		System.out.println("Sorted reversed numbers are:");
		for(int i=0;i<result.length;i++){
        			System.out.print(" "+result[i]);
        		}
	}

}
