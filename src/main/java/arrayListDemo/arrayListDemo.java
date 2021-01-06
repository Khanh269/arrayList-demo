package arrayListDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Comparator;

public class arrayListDemo {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		arrList.add("Hello");
		arrList.add("World");
		System.out.println(arrList);
		arrList.set(1, "Khanh");
		System.out.println(arrList);
		System.out.println();
		for (String s : arrList) {
			System.out.println(s);
		}

		System.out.println();

		System.out.println("Mang chua phan tu \"Hello\":" + arrList.contains("Hello"));
		System.out.println("Kich thuoc mang:" + arrList.size());
		arrList.remove(1);
		System.out.println(arrList);
		arrList.clear();
		System.out.println(arrList);

		ArrayList<String> list = new ArrayList<String>();
		list.add("Xin");
		list.add("Chao");
		list.add("Viet");
		list.add("Nam");
		ListIterator iterator = list.listIterator(); 
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous()+" ");
		}
		System.out.println();
		StringComparator comp = new StringComparator();
		list.sort(comp);
		System.out.println(list);
		System.out.println();

	}
}
