package lambdaExpression;


@FunctionalInterface
interface Factorial 
{
	int fact(int n);
}
public class Exercise5 {
	
	static Factorial f;

	public static void main(String[] args) {
		
		 f = (n) -> {
			if (n == 0)
				return 1;
			else {
				return n*(f.fact(n - 1));
			}
		};
		int i = f.fact(3);
		System.out.println(i);
	}

}
