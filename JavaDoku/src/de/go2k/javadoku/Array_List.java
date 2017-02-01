package de.go2k.javadoku;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> arrliste = new ArrayList<>(20);

		arrliste.add("aa");
		arrliste.add("bb");
		arrliste.add("cc");
		arrliste.add("dd");
		arrliste.add("ee");
		arrliste.add("ff");
		arrliste.add("gg");
		arrliste.add("hh");
		arrliste.add("ii");
		arrliste.add("jj");
		arrliste.add("kk");

		for (String string : arrliste) {
			System.out.print(string + " ");
		}
		
		System.out.println();

		arrliste.remove(2);

		arrliste.remove("bb");

		arrliste.set(2, "jjj");

		arrliste.add(1, "zz");

		System.out.println(arrliste.get(4));

		System.out.println(arrliste.toString());

		ListIterator<String> li = arrliste.listIterator();

		System.out.println("ListIterator");
		while (li.hasNext()) {
			System.out.print(li.next() + " ");
		}
		System.out.println();

		if (arrliste.contains("gg")) {
			System.out.println(arrliste.indexOf("gg"));
			System.out.println(arrliste.size());
		}

		for (String string : arrliste) {
			System.out.print(string + " ");
		}

		System.out.println();
	}
}
