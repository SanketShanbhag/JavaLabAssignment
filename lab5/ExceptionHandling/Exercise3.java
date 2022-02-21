import com.cg.eis.exception.EmployeeException;
import java.util.Scanner;

public class Exercise3 {
	
	
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Salary of employee: ");
			double sal=sc.nextDouble();
			sc.close();
			try
			{
				if(sal>=3000){
					System.out.println("Salary of employee is more than or equal to 3000");
				}else{
					throw new EmployeeException("Salary of employee is less than 3000");
				}
			}catch(EmployeeException e){
				System.out.println(e.getMessage());
			}
			
		}
	

}
