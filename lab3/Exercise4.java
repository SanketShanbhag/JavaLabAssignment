public class Exercise4 {
	static int modifyNumber(int number1){
		
		//Convert number into String 
		String str=Integer.toString(number1);
		
		//Extract each char using charAt method 
		int size=str.length();
		int[] ch=new int[size];
		for (int i = 0; i <size; i++) {
			ch[i]=(int)str.charAt(i);
			
		}
		
		//Convert char to int and find the difference 
		int[] difference=new int[size];
		for(int i=0;i<size-1;i++){
			if(ch[i]>=ch[i+1]){
				difference[i]= ch[i]-ch[i+1];
			}else{
				difference[i]=ch[i+1]-ch[i];
			}	
		}
		difference[size-1]=ch[size-1];
		char a=(char) difference[size-1];
		
		//Create new StringBuffer object and keep adding the difference 
		StringBuffer strb=new StringBuffer();
		for(int i=0;i<size-1;i++){
			strb.append(difference[i]);
			
		}
		strb.append(a);
		
		//Finally convert StringBuffer to int 
		String b=strb.toString();
		int result=Integer.parseInt(b);
		
		return result ;
	}

	public static void main(String[] args) {
		int num=45862;
		int result=modifyNumber(num);
		System.out.println("Given number: "+num);
		System.out.println("Modified Number is: "+result);

	}

}