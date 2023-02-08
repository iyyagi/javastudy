import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import myobj.Peach;

public class D07_HashMap {

	/*
	  # Map
	  
	  - 데이터를 key/value 방식으로 저장하는 자료구조
	  - 인덱스 번호 대신 key 값을 이용해 value에 접근한다.
	  - key 값은 중복을 허용하지 않는다.
	*/
	
	public static void main(String[] args) {
		       // key   value
		HashMap<String, Peach> map1 = new HashMap<>();
		// put(k, v) : 해당 키에 값을 저장한다. 이미 있는 값을 수정도 가능하다.
		map1.put("김민호", new Peach());
		map1.put("먹던것", new Peach());
		
		// get(k) : 키값에 해당하는 Value를 꺼낸다. key를 찾지 못하면 null이 나온다.
		System.out.println(map1);
		Peach p1 = map1.get("최민호");
		Peach p2 = map1.get("김민호");
		System.out.println(p1);
		System.out.println(p2);
		HashMap<String, String> navi = new HashMap<>();
		// HashMap<String, memberInfo> members = new HashMap<>();
		
		navi.put("우리집", "경기도 구리시 무슨동 개나리아파트");
		navi.put("회사", "서울시 강남구 디지털단지");
		navi.put("마트", "...");
		System.out.println(navi);
		
		// putIfAbsent(k, v) : 새로운 등록일때만 키와 데이터를 추가한다. (null을 리턴한다)
		//                     이미 키와 데이터가 존재하면 들어있는 값을 리턴한다.
		String exisValue = navi.putIfAbsent("우리 집", "경기도 구리시");
		navi.put("마트", "경기도 구리시 동구동 농민마트");
		System.out.println(exisValue);
		System.out.println(navi);
		System.out.println(navi.get("우리집"));
		
		// Map 탐색 방법
		
		// keySet() : 해당 맵의 키들로 이루어진 Set을 반환한다.
		Set<String> keys = navi.keySet();
		for (String key:keys) {
			System.out.printf("%s=%s\n", key, navi.get(key));
		}
		// values() : 해당 맵의 value들로 이루어진 Collection을 반환한다. // ArrayList로 묶어서 사용 가능하다.
		List<String> valueList = new ArrayList(navi.values());
		
		for (String value : valueList) {
			System.out.println(value);
		}
		// containsKey : Map의 키값에 해당 키가 있는지 알려준다.
		System.out.println(navi.containsKey("초밥무한리필"));
		System.out.println(navi.containsKey("우리집"));
		// containsValue : Map의 값에 해당 값이 있는지 알려준다.
		System.out.println(navi.containsValue("..."));
		
	}
}
