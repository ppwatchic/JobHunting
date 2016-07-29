package Algorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SortedOnActual {
	
	public static void sortedOnActual(List<Integer> li) {
		Iterator<Integer> iterator =((LinkedList)li).iterator();
		LinkedList<Integer> nli = new LinkedList<Integer>();
		
		while(iterator.hasNext()){
			int e = iterator.next();
			if(e<0) {
				iterator.remove();
				nli.addFirst(e);	//
			}
		}
		
		iterator = nli.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");
		System.out.println();
		
		((LinkedList)li).addAll(0,nli);	//
		
	}
	
	// 1002--1007 
	public static void sortedOnActual2(List<Integer> li){
		for(int i = 1; i < li.size(); i++){
			int tmp = li.get(i);			
			if(tmp < 0) {
				li.remove(i);
				li.add(0, tmp);
			}
		}
	}
	
	public static void reverseLinkedList(List<Integer> li) {
		for(int i = 1; i < li.size(); i++){
			int element = li.remove(i);
			li.add(0,element);
		}
		
		// 
		Iterator<Integer> iterator = li.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " --> ");
		}
	}

	public static void main(String[] args) {
		List<Integer> li = new java.util.LinkedList<Integer>(Arrays.asList(1,-2,-3,4,-5));
		System.out.println(li.size());
		
		Iterator<Integer> iterator = li.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " --> ");
		}
		
		System.out.println();
		sortedOnActual2(li);	
		iterator = li.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() +" --> ");
		}
		
		System.out.println();
		reverseLinkedList(li);	

	}

}
