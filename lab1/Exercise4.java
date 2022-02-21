import java.util.Scanner;

public class Exercise4 {
	static boolean Prime(int n){
		
		if(n==1){
			return false;
		}
		
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
				
			}	
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("input an integer which prints the prime numbers up to that integer number");
		int n=scn.nextInt();
		scn.close();
		
		System.out.println("Prime number from 1 to "+n+" are: ");
		for(int num=1;num<=n;num++){
			boolean ans=Prime(num);
			if(ans==true){
				System.out.print(num+" ");
			}
		}
		
	}
	
}