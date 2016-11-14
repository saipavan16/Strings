//String using the collections

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Airlines{

	public static void main(String[] args) {
		Map<String, String> art = new HashMap<String, String>();
		art.put("SEA","ORD");
		art.put("EWR", "IAH");
		art.put("IAH", "SEA");
		
		
		String startpoint = "";

		//public String findFirstCity(List<Ticket> tickets){
		for(Entry<String, String> en:art.entrySet()){
			
			if(!art.containsValue(en.getKey())){
				startpoint = en.getKey();
				System.out.println("Starting point:" +startpoint);
				break;
			}
		}
		//}
		System.out.println(startpoint);
		System.out.println(art.size());
		for(int i=0; i < art.size(); i++){
			System.out.print( " " + art.get(startpoint));
			startpoint = art.get(startpoint);
		}
		
	}

}
