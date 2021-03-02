package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//TreeMap
public class Example2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      TreeMap<String, String> map = new TreeMap<>();
      //�˻��� ��ɰ� ���õ� �޼ҵ尡 TreeSet�� ����Ǿ� �ֱ� ������ Set<String> set = new TreeSet<String>();���� ���� �ʾҴ�.
      //�ڽİ�ü�� �θ�Ÿ������ ������ �θ��� �޼ҵ常 �� �� ����
      
      map.put("s1", "�ڱ��");
      map.put("s3", "ȫ�浿");
      map.put("s4", "�浹��");
      map.put("s2", "���ڹ�");
      map.put("s5", "�����̳�");
      
      Set<String> keys = map.keySet();
      for(String key : keys) {
         System.out.println(key + ": " + map.get(key)); //Ű�� ���ĵ�.
      }
      
      System.out.println();
      
      //��������
      keys = map.descendingKeySet();
      for(String key : keys) {
         System.out.println(key + ": " + map.get(key)); //Ű�� ���ĵ�.
      }
      
      System.out.println();
      
      //����ʸ� ��������
      Map<String, String> smap = map.subMap("s3", true, "s5", true); //s3���� �����ؼ�, s5���� �����ؼ� ã�´�.
      keys = smap.keySet();
      for(String key : keys) {
         System.out.println(key + ": " + map.get(key)); //Ű�� ���ĵ�.
      }
   }
}