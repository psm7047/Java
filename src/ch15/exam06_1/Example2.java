package ch15.exam06_1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//TreeMap
public class Example2 {

   public static void main(String[] args) {
      //TreeMap�� �˻��� ���õ� �޼ҵ�
      TreeMap<String, String> map = new TreeMap<>();
      
      map.put("s1", "�ڱ��");
      map.put("s2", "ȫ�浿");
      map.put("s3", "�浹��");
      map.put("s4", "���ڹ�");
      map.put("s5", "�����̳�");
      
      //�ڵ����� �������� ���
      Set<String> keys = map.keySet();
      for(String key : keys) {
    	  System.out.println(key + " : " + map.get(key));
      }
      System.out.println();
      
      //������������ �������ִ� �޼ҵ�
      keys = map.descendingKeySet();
      for(String key : keys) {
    	  System.out.println(key + " : " + map.get(key));
      }
      System.out.println();
      
      //����� �������� s3~s5����
      Map<String, String> smap = map.subMap("s3", true, "s5", true);
      keys = smap.keySet();
      //�ڵ����� �������� ���
      for(String key : keys) {
    	  System.out.println(key + " : " + map.get(key));
      }
      
      
      
      
   }
}