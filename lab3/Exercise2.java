public class Exercise2 {
	
		public static String getImage(String str){
			StringBuilder sb=new StringBuilder(str);
			StringBuilder reverse= sb.reverse();
			String x=reverse.toString();
			return x;
			
		}
		public static void main(String []args){
			String str="sanket";
			String result=getImage(str);
			System.out.println(str+"|"+result);
			
		}

}