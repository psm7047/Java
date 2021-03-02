package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//TreeMap
public class Example2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      TreeMap<String, String> map = new TreeMap<>();
      //검색과 기능과 관련된 메소드가 TreeSet애 선언되어 있기 때문에 Set<String> set = new TreeSet<String>();으로 받지 않았다.
      //자식객체를 부모타입으로 받으면 부모의 메소드만 쓸 수 있음
      
      map.put("s1", "박길순");
      map.put("s3", "홍길동");
      map.put("s4", "방돌이");
      map.put("s2", "감자바");
      map.put("s5", "디자이너");
      
      Set<String> keys = map.keySet();
      for(String key : keys) {
         System.out.println(key + ": " + map.get(key)); //키가 정렬됨.
      }
      
      System.out.println();
      
      //내림차순
      keys = map.descendingKeySet();
      for(String key : keys) {
         System.out.println(key + ": " + map.get(key)); //키가 정렬됨.
      }
      
      System.out.println();
      
      //서브맵만 가져오기
      Map<String, String> smap = map.subMap("s3", true, "s5", true); //s3부터 포함해서, s5까지 포함해서 찾는다.
      keys = smap.keySet();
      for(String key : keys) {
         System.out.println(key + ": " + map.get(key)); //키가 정렬됨.
      }
   }
}