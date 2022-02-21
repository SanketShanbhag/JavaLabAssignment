
	
public class Exercise6_1 {
	
		static int calculateDifference(int n){

			//sum of squares
			int sum=0;
			for(int i=1;i<=n;i++){
				int square=i*i;
				sum+=square;
				
			}
			
			//square of sum
			int sum2=0;
			for(int i=1;i<=n;i++){
				 sum2+=i;
				
			}
			int square=sum2*sum2;

			//Calculate difference
			int difference=sum-square;
			
			return difference;
			
		}
		
		
		public static void main(String[] args){
			int n=6;
			int result=calculateDifference(n);
			System.out.println("the difference is= "+result);
		}
	

}