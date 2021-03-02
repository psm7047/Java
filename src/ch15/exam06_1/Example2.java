package ch15.exam06_1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//TreeMap
public class Example2 {

   public static void main(String[] args) {
      //TreeMap에 검색과 관련된 메소드
      TreeMap<String, String> map = new TreeMap<>();
      
      map.put("s1", "박길순");
      map.put("s2", "홍길동");
      map.put("s3", "방돌이");
      map.put("s4", "감자바");
      map.put("s5", "디자이너");
      
      //자동으로 오름차순 출력
      Set<String> keys = map.keySet();
      for(String key : keys) {
    	  System.out.println(key + " : " + map.get(key));
      }
      System.out.println();
      
      //내림차순으로 정렬해주는 메소드
      keys = map.descendingKeySet();
      for(String key : keys) {
    	  System.out.println(key + " : " + map.get(key));
      }
      System.out.println();
      
      //서브맵 가져오기 s3~s5까지
      Map<String, String> smap = map.subMap("s3", true, "s5", true);
      keys = smap.keySet();
      //자동으로 오름차순 출력
      for(String key : keys) {
    	  System.out.println(key + " : " + map.get(key));
      }
      
      
      
      
   }
}