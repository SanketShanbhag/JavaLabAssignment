import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Select a/b/c in the given three lights \na)red\nb)yellow\nc)green");
		char var=scn.next().charAt(0);
		scn.close();
		switch (var) {
		case 'a': 
			System.out.println("STOP");
			break;
		case 'b':
			System.out.println("READY");
			break;
		case 'c':
			System.out.println("GO");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}