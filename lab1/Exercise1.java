public class Exercise1 {
	
	static int sum(int a){
		int sum=0;
		for(int i=1;i<=a;i++){
			int cube=i*i*i;
			sum+=cube;
		}
		return sum;
	}

	public static void main(String[] args) {
		int a=9;
		int result=sum(a);
		System.out.println("the total sum of cubes = "+result);
		

	}

}