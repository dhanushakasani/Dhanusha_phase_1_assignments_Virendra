package abstractclass.java;
import java.util.HashMap;
import java.util.Map;
class HashMapList1{
public static void main(String[] args){
			
		Map<Integer, String> HashMap = new HashMap<Integer, String>();
			
		    HashMap.put(1, new String("apple"));
		    HashMap.put(2,new String("plum"));
			HashMap.put(3, new String("kiwi"));
			HashMap.put(4, new String("grapes"));
			HashMap.put(5, new String("watermelon"));
			HashMap.put(6, new String("mango"));
			HashMap.put(7, new String("pineapple"));
			HashMap.put(8, new String("cherries"));
			HashMap.put(9, new String("orange"));
			HashMap.put(10, new String("banana"));
			
		   System.out.println("Contents of HashMap : " + HashMap);	
		   System.out.println("\nValues of map after iterating over it : ");
		   for (Integer key : HashMap.keySet()) {
	           System.out.println(key + ":\t" + HashMap.get(key));
	       }
		   System.out.println("\n HashMap contains 4 as key? : " + HashMap.containsKey(4));
		   System.out.println("HashMap contains banana as value? : " + HashMap.containsValue("banana"));
		   System.out.println("HashMap contains apple as value? : " + HashMap.containsValue("apple"));
		   System.out.println("\nRemove entry for key 4 : " + HashMap.remove(4));
		   System.out.println("Content of HashMap after removing key 4: " + HashMap);
		   System.out.println("\nRemove entry for key 7 : " + HashMap.remove(7));
		   System.out.println("Content of LinkedHashMap after removing key 7: " + HashMap);
		   System.out.println("hascode"+ HashMap.hashCode());
		   HashMap.clear();
		   System.out.println("\nContent of HashMap after clearing: " + HashMap);
			
		   
		    
			
		}
	}


	


