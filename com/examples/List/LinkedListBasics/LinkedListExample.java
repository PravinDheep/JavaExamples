package com.examples.List.LinkedListBasics;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> llist  = new LinkedList<String>();
		llist.add("Britannia");
		llist.add("Milk Bikis");
		llist.add("ParleG");
		llist.add(2, "Monaco");
		llist.add("Britannia");
		System.out.println("Linked List Elements: " +llist);
		llist.addFirst("Maska-Chaska");
		llist.addLast("Horlicks");
		System.out.println("Linked List Elements: " +llist);
		System.out.println("Linked List Elements: " +llist.indexOf("Monaco"));
		System.out.println("Linked List Elements: " +llist.lastIndexOf("Britannia"));
		System.out.println("Linked List Elements: " +llist.poll());
		System.out.println("Linked List Elements: ");
		for(String packs : llist){
		System.out.println(packs);
		}
		llist.pollLast();
		llist.removeFirst();
		System.out.println("Iterated Elements after Removing First and Last :");
		Iterator<String> iterate = llist.iterator();
		while(iterate.hasNext()){
			System.out.println(iterate.next());
		}
	}

}
