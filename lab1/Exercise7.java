class Exercise7{
	static boolean checkNumber(int number){
	while(number>0)
	{
		int digit = number%10;
		number = number/10;
		if(digit < number%10){
			return false;}
	}
	return true;
	}
	public static void main(String[] args){
		int number=123;
		boolean result=checkNumber(number);
		if(result){
			System.out.println(number+" is in increasing order");
		}else{
			System.out.println(number+" is not in increasing order");
		}
	}
}