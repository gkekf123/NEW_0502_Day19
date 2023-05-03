package day19_0502.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListQuiz01 {

	public static void main(String[] args) {

		/* 
		 * List 1번
		 * 	1. list에 1 ~ 20까지 값을 순서대로 저장
		 * 	2. list에 값을 순서대로 출력
		 */
		
		/*
		 *  List 2번
		 *   User를 저장하는 list생성
		 *   3개의 각각 다른 User객체를 만들고 순서대로 저장
		 *   User객체 안에 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드
		 *   User객체 안에 홍길자가 있으면 해당 객체를 삭제 코드
		 */
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= 20; i++) {
			list.add(i);
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		System.out.println("=======================================================");
		
		
		List<User> userlist = new ArrayList<>();
		
		User user1 = new User("홍길동", 20);
		User user2 = new User("홍길자", 30);
		User user3 = new User("이순신", 40);
		
		userlist.add(user1);
		userlist.add(user2);
		userlist.add(user3);
		
		for(int i = 0; i < userlist.size(); i++) {
			
//			User u = userlist.get(i);
//			String name = u.getName();
			
//			if(name.equals("홍길동")) {
//				System.out.println(u.getName() + " " + u.getAge());
//			} else if(name.equals("홍길자")) {
//
//			}
			User u = userlist.get(i);
			
			if(u.getName().equals("홍길동")) {
				System.out.println(u.getName() + " " + u.getAge());
			} else if(u.getName().equals("홍길자")) {
				userlist.remove(i);
				System.out.println("홍길자 삭제");
			}
		}
		System.out.println(userlist.toString());
		
		
			
			
	}

}
