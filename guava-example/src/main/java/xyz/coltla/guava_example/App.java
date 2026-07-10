package xyz.coltla.guava_example;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		
		Multiset<String> animals = HashMultiset.create();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("mouse");
		
		animals.forEach(System.out::println);
	}
}
