public class Exercise8 {
	
		static boolean positiveString(String str) {
			int size = str.length();
			char[] chArray = new char[size];
		
			// string to char array
			for (int i = 0; i <str.length(); i++) {
				chArray[i] = str.charAt(i);
			}

			// sorting 
			for(int i=0;i<=chArray.length-1;i++){
				for(int j=i+1;j<=chArray.length-1;j++){
					char temp;
					if(chArray[i]>chArray[j]){
						temp = chArray[i];  
						chArray[i] = chArray[j];  
						chArray[j] = temp;
					}
				}
			}
		
			//comparing
			for (int i = 0; i < size; i++) {
				if (chArray[i] != str.charAt(i)) {

				return false;
				}
			}
			return true;
		}
	
		public static void main(String[] args) {

			String str = "abhi";
			if (positiveString(str)) {
				System.out.println("String="+str+" is a postive String ");
			} else {
				System.out.println("String="+str+" is not a postive String " );
			}
		}

}