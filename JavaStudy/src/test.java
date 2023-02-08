import java.util.HashMap;
import java.util.Map;

public class test {
	
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("1", "강병천");
		map.put("2", "허원석");
		map.put("3", "신윤철");
		
		Map<String, String> map2 = new HashMap<>();
		
		map2.put("4", "100");
		map2.put("5", "200");
		map2.put("6", "300");
		
		map2.putAll(map);
		
		System.out.println(map2);
		
		for (String key:map.keySet()) {
			System.out.println("{" + key + ", "+ map.get(key) + "}");
		}
		
		for (String key2:map2.keySet()) {
			System.out.println(key2 + map2.get(key2));
		}
		
	
	}
}
