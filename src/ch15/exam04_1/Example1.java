package ch15.exam04_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {
	
		//Map생성
	Map<String, String> map = new HashMap<>();
	
	//Entry 저장
	map.put("s1", "홍길동");
	System.out.println(map.size());
	
	//키의 value 가져오기
	String s1 = map.get("s1");
	System.out.println(s1);
	
	//반복처리
	Set<Entry<String, String>> set = map.entrySet();
	for(Entry<String, String> entry : set) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
	}
	
	//반복처리2	//키set에 있는 key를 map에서 찾아 value 반환
	Set<String> set2 = map.keySet();
	for(String key : set2) {
		String value = map.get(key);
		System.out.println(key + " : " + value);
	}
	
	//삭제
	map.remove("s1");
	map.clear();
		
	}
}
