package com.queue.test;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<>();
		   pq.add("9");     
           pq.add("8");
			pq.add("7");
//			System.out.println(pq);
			pq.offer("6");      
			
           System.out.println(pq.peek() + " ");  //    6  7  8   9
//			pq.offer("5");
//           pq.add("3");
           pq.remove("9");

           System.out.println(pq);
		

	}

}
