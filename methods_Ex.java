package hashMap;

import java.util.HashMap;

public class methods_Ex {

	public static void main(String[] args) {


		HashMap map = new HashMap();
		map.put(null, 52);
		map.put(2, 258);
		map.put(5, 45);
		map.put(11, null);
		map.put(15, null);
		
//		System.out.println(map);
//		
//		System.out.println(map.containsKey(2));

		
		
		
		
		
//		wap to get the value to specified key in the map
		
		
		
		
//		wap to get all the keys form the given kaymaps
		
//		System.out.println(map.containsValue(45));
//		
//		
//		wap to copy a tree map conatain to anoter treemap
//		HashMap map2 = new HashMap();
//		map2.clone(map);
		
//		wap to delete all the elements form a given treemap
//		System.out.println(map.clear());
		
		
		
//		wap to check whether map contains value present or not
//		System.out.println(map.isEmpty());
		
//		wap program to test if a map contains a specified key 
//		System.out.println(map.containsKey(5));
		
		
//		if a map contains a specific value
//		System.out.println(map.containsValue(45));
		
//		wap to create to set view of mappings contain in a map
	
		System.out.println(map.entrySet());
		
//		wap to get a view of keys contains in a map
		System.out.println(map.keySet());
		
//		wap to get a collection view of values contains in this map
		System.out.println(map.values());
		
//		wap to search a key in map
//		System.out.println(map.containsKey(258));
		
		System.out.println(map);
	}

}
