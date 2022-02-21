package lambdaExpression;

@FunctionalInterface
interface Authentication {
	
	boolean checkDetails(String username, String password);

}

public class Exercise3 {
	
	public static void main(String[] args) {

		String username = "SanketS";
		String password = "root123";
		Authentication p = ((username1, password1) -> {
			if (username1.equals(username) && password1.equals(password))
				return true;
			else
				return false;
		});
		System.out.println(p.checkDetails("SanketS", "root1234"));
	}

}
