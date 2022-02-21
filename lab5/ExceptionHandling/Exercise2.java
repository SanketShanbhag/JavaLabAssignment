

import com.cg.eis.exception.FoundBlankInNameException;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		
		String fname="";
		String lname="";
		try{
			if(fname.isEmpty() && lname.isEmpty()){
				throw new FoundBlankInNameException("Check the Name field and don't leave it blank!!!!");
			}else{
				System.out.println("Validated!!");
			}
		}catch(FoundBlankInNameException e){
			System.out.println(e.getMessage());
		}

	}

}
