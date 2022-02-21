public class Exercise3 {
	static String alterString(String a){
		char[] ch=a.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]== 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i]== 'u'){
	            			continue;
	        		}else{
	        			ch[i] = (char) (ch[i] + 1);
	        		}	
		}
		String result=String.valueOf(ch);   //converts to String
		return result;
	}
	public static void main(String[] args) {
		String a="capgemini";
		String result=alterString(a);
		System.out.println("Given String: "+a);
		System.out.println("After replacing: "+result);
		
	}

}