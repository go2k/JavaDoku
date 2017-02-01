package de.go2k.javadoku;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratoren {

	public static void main(String[] args) {
		ArrayList<String> text = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			text.add("" + i);
		}
		xxxx(text);
	}

	private static void xxxx(ArrayList<String> text) {
		Iterator<String> iterator = text.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
	}

}
