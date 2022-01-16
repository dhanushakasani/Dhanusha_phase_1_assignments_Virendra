package core.programs;
import java.util.LinkedHashSet;
import java.util.Map;

	public class Linkedset {

		public static void main(String[] args) {

			LinkedHashSet<String> hs = new LinkedHashSet<String>();
	        
			
		    hs.add("apple");
		    hs.add("plum");
			hs.add("kiwi");
			hs.add("grapes");
			hs.add("watermelon");
			hs.add("mango");
			hs.add("pineapple");
			hs.add("cherries");
			hs.add("orange");
			hs.add("banana");
			
		   System.out.println("Hashset is : " + hs);
		   System.out.println("size of hashset is"+hs.size());
		  
		   System.out.println("\n HashSet contains orange or not? : " + hs.contains("orange"));
		  
		   System.out.println("\nRemove entry for key 4 : " + hs.remove("mango"));
		   System.out.println("Content of HashMap after removing key 4: " + hs);
		   System.out.println("\nRemove entry for key 7 : " + hs.remove("grapes"));
		   System.out.println("Content of HashMap after removing key 7: " + hs);
		   hs.add("papaya");
		   hs.add("greenapple");
		   hs.add("blueberry");
		   System.out.println("after adding 3 fruits hashset is:"+hs);
		   System.out.println("size of hashset is"+hs.size());
		   System.out.println("hascode"+ hs.hashCode());
		   System.out.println("Check if HashSet is empty : " + hs.isEmpty());
		   
			
		   
		    
			
		}



		}


