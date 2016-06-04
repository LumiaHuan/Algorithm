package com.lumiajohn.algo.queue.linklist;

public class TestCircularQueue {
	public static void main(String[] args) {
		CircularLinkedListQueue<Integer> queue = new CircularLinkedListQueue<Integer>(0);
		System.out.println(queue);
		queue.enQueue(1);
		System.out.println(queue);
		queue.enQueue(2);
		System.out.println(queue);
		queue.enQueue(3);
		System.out.println(queue);
		int d = queue.deQueue();
		System.out.println("remove:"+d+":"+queue);
		d = queue.deQueue();
		System.out.println("remove:"+d+":"+queue);
		d = queue.deQueue();
		System.out.println("remove:"+d+":"+queue);
		d = queue.deQueue();
		System.out.println("remove:"+d+":"+queue);
		queue.enQueue(1);
		System.out.println(queue);
		

	}
}
