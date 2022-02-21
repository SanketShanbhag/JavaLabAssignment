package lambdaExpression;

@FunctionalInterface
interface space {
	String s(String str);
}

public class Exercise2 {
	
		public static void main(String[] args) {
			
			
			space str = (str1) -> {
				
				return str1.replace("", " ");
			};
			String result=str.s("Capgemini");
			System.out.println(result);
		}

	

}
