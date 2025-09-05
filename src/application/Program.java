package application;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Program {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("Tv");
		set1.add("Tablet");
		set1.add("Notebook");

		System.out.println(set1.contains("Notebook"));
		for (String p : set1) {
			System.out.println(p);
		}

		System.out.println();
		Set<String> set2 = new TreeSet<>();
		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");

		System.out.println(set2.contains("Notebook"));
		for (String p : set2) {
			System.out.println(p);
		}

		System.out.println();
		Set<String> set3 = new LinkedHashSet<>();
		set3.add("Tv");
		set3.add("Tablet");
		set3.add("Notebook");

		System.out.println(set3.contains("Notebook"));
		for (String p : set3) {
			System.out.println(p);
		}
	}
}