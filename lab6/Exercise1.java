import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Exercise1  {
	List<String> getValues(HashMap<String,Integer> hm){
		//sorting
		TreeMap<String,Integer> sorted = new TreeMap<>();
		sorted.putAll(hm);
		
		//map to list
		ArrayList<String> result= new ArrayList<String>(sorted.keySet());
		return result;
	}
	public static void main(String[] args){
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("Raj",2004);
		hm.put("Vishnu",1004 );
		hm.put("Bob",9675);
		hm.put( "Ambi",5628);
		hm.put("Karthik",6393);
		
		Exercise1 e1=new Exercise1();
		List<String> str=e1.getValues(hm);
		System.out.println(str);
		
	}
	
	

}