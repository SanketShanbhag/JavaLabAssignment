package lambdaExpression;

@FunctionalInterface
interface Intf {
	int a(int x, int y);
}

public class Exercise1 {
		
		public static void main(String[] args) {
			Intf i = (x, y) -> {
				return (int)(Math.pow(x,y));};
			int result=i.a(10,3);
			System.out.println(result);
		}

}

