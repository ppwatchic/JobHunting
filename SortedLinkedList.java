package Algorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SortedOnActual {
	
	public static void sorteddOnActual(List<Integer> li) {
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

	public static void main(String[] args) {
		List<Integer> li = new java.util.LinkedList<Integer>(Arrays.asList(1,-2,-3,4,-5));
		System.out.println(li.size());
		
		Iterator<Integer> iterator = li.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " --> ");
		}
		
		System.out.println();
		sorteddOnActual(li);	
		iterator = li.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() +" --> ");
		}
		
		

	}

}
