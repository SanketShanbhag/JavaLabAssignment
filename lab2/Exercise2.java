import java.util.Arrays;
public class Exercise2 {
	static String sortStrings(String[] arr){
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j <size; j++) {

				if (arr[i].compareTo(arr[j])>0) {

				String temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		String result=Arrays.toString(arr);
		
		return result;
	}
	

	public static void main(String[] args) {
		String[] str = { "amruth","Sanket","bob","anil","Kavya","Abhiram","rakesh"};
		String result=sortStrings(str);
		System.out.println(result);

	}
}