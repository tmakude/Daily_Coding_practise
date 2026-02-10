package New_Start;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Map_Practise {

	public static void main(String[] args) {
		
		Map<String , String> map = new HashMap<>();
		
		map.put("Tushar", "Makude");
		map.put("Navnath", "Tarte");
		map.put("Vikas", "Hiwale");
		map.put("Rajendra", "Tartee");
		
		Map<String , String> newmap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry :: getValue , Map.Entry :: getKey));
		
		System.out.println(newmap);
		


		

	}

}
