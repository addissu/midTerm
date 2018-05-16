import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//Tomi Olubeko
//Adisu Tamru
//


//The answer to question to: mystery3(6) is 6, and mystery(17) is 8.

//What indexes will be examined as the middle element by a binary search for each of the following target values

public class MaxOccurances {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		//linked list added to list
		list.add(14);
		list.add(1);
		list.add(6);
		list.add(12);
		list.add(30);
		list.add(4);
		list.add(8);
		list.add(21);
		list.add(2);
		list.add(30);
		list.add(-1);
		
		System.out.println(maxOccurences(list));
		
		System.out.println(digitMatch(13345, 3725));
		
		

	}
	
	public static int maxOccurences (List<Integer> list) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		
	    for (int i = 0; i < list.size(); i++) {
	    	if(map.containsKey(list.get(i))) {
	    		map.put(list.get(i), map.get(list.get(i)) + 1);
	    	}
	    	else {
	    		map.put(list.get(i), 1);
	    	}
		
	    }
	    
	    int mode = 0;
	    
	    for(Integer c: map.values()) {
	    	if(c > mode) {
	    		mode = c;
	    	}
	    }
	    
	    return mode;

	}
	
	private static boolean isMatch(int a1, int b1) {
		return a1 == b1;
	}
	
	public static int digitMatch(int a, int b) {
		
		if(a < 0 || b < 0) {
			throw new IllegalArgumentException("Numbers must be positive");
		}
		if(a == 0 || b == 0) {
			return 0;
		}
		
		if(isMatch(a % 10, b % 10)) {
			return 1 + digitMatch(a / 10, b / 10);
		}
		
		return digitMatch(a / 10, b / 10);
	}
}
