package day0217.collection.set;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		int[] score = { 23, 10, 28, 15, 7, 22, 56 };

		TreeSet<Integer> tree = new TreeSet<>();
		for (int i : score) {
			tree.add(i);
		}
		System.out.println(tree);
		System.out.println(tree.headSet(15));
		System.out.println(tree.tailSet(15));

	}

}
