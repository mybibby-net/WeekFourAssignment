import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;


public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> mapTest = new HashMap<String, Integer>();
		mapTest.put("Entry One", 1);
		mapTest.put("Entry Two", 2);
		System.out.println(mapTest);
		int i = 0;
		
		System.out.println();
		
	}

	public static Map<String, Integer> instanceCount (List<String> list){
		
		Map<String, Integer> items = new HashMap<String, Integer>();
		
		for (String item : list) {
			
			if (items.containsKey(item)) {
				
				items.put(item, items.get(item) + 1);
				
			} else {
				
				items.put(item, 1);
				
			}
			//System.out.println(items);
		}
		return items;
		
	}
	
}
