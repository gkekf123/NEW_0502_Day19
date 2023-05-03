package day19_0502.collection.list;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		/* 
		 * LinkedList
		 * 	순서 O, 중복 O
		 *  노드객체 (양방향 연결리스트)
		 *  삽입, 삭제는 ArrayList보다 좋으나 탐색은 느리다
		 *  list와 기능은 동일하다
		 */
		
		LinkedList<Integer> list = new LinkedList<>();
		
		// 추가
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.toString());
		
		// 중간에 추가
		list.add(3, 10);
		System.out.println(list.toString());
		
		// get()
		int n = list.get(3);
		System.out.println(n);
		
		// remove()
		list.remove(3);
		System.out.println(list.toString());
		
		System.out.println("========== LinkedList의 기능(위는 list와 기능이 같다) ==========");
		// linklist는 queue의 기능을 구현하기 때문에 queue기능도 사용이 가능
		
		// 뒤에서부터 넣는다
		list.offer(10);
		list.offer(11);
		System.out.println(list.toString());
		
		// 앞에서부터 뺀다
		int r = list.poll();
		System.out.println(r);
		System.out.println(list.toString());
		
		
		
		
		
		
	}

}
