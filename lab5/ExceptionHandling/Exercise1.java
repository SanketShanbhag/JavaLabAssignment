

import com.cg.eis.exception.AgeNotValidException;
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		sc.close();
		
		try{
			if(age>15){
				System.out.println("Valid age!!");
			}else{
				throw new AgeNotValidException("Invalid Age! Age should be more than 15");
			}
				
		}catch(AgeNotValidException e){
			System.out.println(e.getMessage());
		}

	}

}