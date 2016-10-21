import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import java.util.Map;
import java.util.Map.Entry;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
	   
	   final Map<Integer,List<String>> oldMap = old;
	   final Map<String, Integer> newMap= new HashMap<String, Integer>(); 
	   
	   Iterator entries = oldMap.entrySet().iterator();
	   while (entries.hasNext()) {
	     Entry thisEntry = (Entry) entries.next();
	     Object oldKey = thisEntry.getKey();
	     Object oldValue = thisEntry.getValue();
	     int newValue = (int) oldKey;
	     List<String> newList= (List<String>)oldValue;
	     for(String letter : newList){
	     String newKey= letter.toLowerCase();
	     System.out.println("old key||"+oldKey+"||old Value||"+oldValue+"||new key||"+newKey+"||new value||"+newValue);
	     newMap.put(newKey, newValue);
	     }
	     
	   }
	   
	  /*
	   old.forEach((points , list) -> {
		   list.forEach((letter) -> {
			   newMap.put(letter.toLowerCase(), points);
		   });
	   });
	   */
	   return newMap;
      
   }
}
