public class Exercise3 {
	static int Fibonacci_Recursive(int n){
		
		if (n <= 1){
		    return n;
		}
		return Fibonacci_Recursive(n-1)+Fibonacci_Recursive(n-2);
		
	}

	static int Fibonacci(int count){
		int first=1,second=first,third=0;
		System.out.println("Fibonacci Series are:");
		System.out.print(first+" "+second);
		for(int i=2;i<count;i++){
			third=first+second;
			System.out.print(" "+third);
			first=second;
			second=third;
		}
		System.out.println();
		return third;
		
	}

	public static void main(String[] args) {
		int count=10;
		
		// Fibonacci using Non-Recursive function
		int nth_value=Fibonacci(count);
		System.out.println("the nth value of the Fibonacci using Non-Recursive function is: "+nth_value );
		
		//Fibonacci using Recursive function
		System.out.print("the nth value of the Fibonacci using Recursive function is: ");
		System.out.println(Fibonacci_Recursive(count));
	}


}