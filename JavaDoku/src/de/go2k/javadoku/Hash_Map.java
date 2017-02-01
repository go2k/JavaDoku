package de.go2k.javadoku;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
	
	public static void main(String[] args) {
		
		Map<String, String> person = new HashMap<String, String>();
		person.put("Vorname", "Hans");
		person.put("Name", "Mustermann");
		person.put("Geburtstag", "01.01.01");
		person.put("Wohnort", "Musterstadt");
		
		System.out.println("-get--------------------");
		System.out.println(person.get("Name"));
		System.out.println("-size--------------------");
		System.out.println(person.size());
		System.out.println("-isempty--------------------");
		System.out.println(person.isEmpty());
		System.out.println("-containsKey--------------------");
		System.out.println(person.containsKey("Name"));
		System.out.println("-containsKey--------------------");
		System.out.println(person.containsKey("xxx"));
		System.out.println("---------------------");
		System.out.println(person.containsValue("Hans"));
		System.out.println("-put--------------------");
		System.out.println(person.put("Vorname", "Hansi"));
		System.out.println(person.get("Vorname"));
		System.out.println("---------------------");
		System.out.println(person.remove("Name"));
		System.out.println(person.get("Name"));
		System.out.println("---------------------");
		System.out.println(person.toString());
	}
}
