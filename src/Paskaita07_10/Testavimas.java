package Paskaita07_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

	public class Testavimas {
	ArrayList<Koordinate> arrayList;
	LinkedList<Koordinate> linkedList;
	HashSet<Koordinate> hashSet;
	
	
	public void initArray() {
		arrayList = getBigArrayList();
	}
	
	public void initLinked() {
		linkedList = getBigLinkedList();
	}
	
	public void initHash() {
		hashSet = getBigHashSet();
	}
	public HashSet<Koordinate> getBigHashSet() {
		HashSet<Koordinate> list = new HashSet<>();
		
		for(int i = 0; i < 10000000; i++) {
			list.add(new Koordinate(i,i));
		}
		return list;
	}

	 public ArrayList<Koordinate> getBigArrayList() {
		ArrayList<Koordinate> list = new ArrayList<>();
		
		for(int i = 0; i < 10000000; i++) {
			list.add(new Koordinate(i,i));
		}
		return list;
	}
	 public LinkedList<Koordinate> getBigLinkedList() {
		LinkedList<Koordinate> list = new LinkedList<>();
		
		for(int i = 0; i < 10000000; i++) {
			list.push(new Koordinate(i,i));
		}
		return list;
	}
	 
	 public void removeFromArrayList() {
		 for(int i = 0; i < 100000 ; i++) {
			 Koordinate el = arrayList.get(i);
		 }
	 }
	 public void removeFromLinkedList() {
		 for(int i = 0; i < 100000 ; i++) {
			 Koordinate el = linkedList.get(i);
		 }
	 }
	 public void removeFromHashSet() {
		 for(int i = 0; i < 100000 ; i++) {
			hashSet.stream()
			.findAny();
		 }
	 }
}
