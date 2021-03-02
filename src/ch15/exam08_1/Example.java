package ch15.exam08_1;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		//익명 구현 객체
		//Product비교 불가능하므로 비교자 comparator 제공
		TreeSet<Product> set = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}
				else if(o1.price == o2.price) {
					return 0;
				}
				else {
					return 1;
				}
			}
		});

		set.add(new Product("TV",10000));
		set.add(new Product("Audio",5000));
		set.add(new Product("Car",12000));

		//가격 기준으로 오름차순 정렬
		for(Product p : set) {
			System.out.println(p.name + " , " + p.price);
		}
		System.out.println();

		//익명 구현 객체
		TreeMap<Product, String> map = new TreeMap<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if(o1.price < o2.price) {
					return -1;
				}
				else if(o1.price == o2.price) {
					return 0;
				}
				else {
					return 1;
				}
			}	
		});

		map.put(new Product("TV",10000), "LG");
		map.put(new Product("Audio",5000), "Samsung");
		map.put(new Product("Car",12000), "Hyundai");

		//Product의 가격 기준으로 오름차순 정렬
		Set<Product> pset = map.keySet();
		for(Product p : pset) {
			System.out.println(p.name + " , " + p.price + " , " + map.get(p));
		}
	}
}
