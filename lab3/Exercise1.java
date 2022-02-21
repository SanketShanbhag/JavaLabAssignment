import java.util.Scanner;
import java.util.StringTokenizer;
class Exercise1{
    static int sum(String s){

	StringTokenizer st = new StringTokenizer(s);
	int sum = 0;
	System.out.println("Displaying the integers:");
	while (st.hasMoreTokens()) {  //hasMoreTokens=checks the availability of tokens
		String temp = st.nextToken();  //nextToken= returns token
		int n = Integer.parseInt(temp);
		System.out.print(n+" ");
		sum = sum + n;
	}
	System.out.println();
	return sum;
     }	
    public static void main(String args[]) {
        
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter integers with one space gap:");
	String s = sc.nextLine();
	sc.close();
	int result=sum(s);
	System.out.println("sum of the integers is: " +result);
    }
}