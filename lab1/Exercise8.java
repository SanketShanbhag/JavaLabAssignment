class Exercise8{
	static boolean checkNumber(int n){
		
         		 if (n == 0 || n==1 || n==2){
          			return false;
		}
       		 while ( n != 1) {
           	 		if (n % 2 != 0){
               				 return false;
			}
            			n = n / 2;
      		  }
        		return true;
	}
	public static void main(String[] args){
		int n=52;
		boolean result=checkNumber(n);
		if(result){
			System.out.println("the number "+n+"  is a power of 2");
		}else{
			System.out.println("the number "+n+"  is  not a power of 2");
		}
	}
}