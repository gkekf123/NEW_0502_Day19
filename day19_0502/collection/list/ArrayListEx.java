package day19_0502.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {

		/* 
		 * ArrayList
		 * 	배열기반
		 * 	순서 O, 중복 O
		 */
		
		// 사용해도 된다 - ArrayList<String> list = new ArrayList<>();
		
		List<String> list = new ArrayList<>();
		
		//////////////////// 1. list추가 add()	
		list.add("홍길동");
		list.add("이순신");
		list.add("강감찬");
		list.add("신사임당");
		list.add("김유신");
		
		// 문자열로 확인 .toString()
		System.out.println(list.toString());
		
		////////////////////// 길이 확인 size()
		System.out.println("리스트의 길이 : " + list.size());
		
		// 중간에 추가
		list.add(0, "0번째 추가"); // (추가할 인덱스 값, 추가할 문자열)
		System.out.println(list.toString());
		
		// ///////////////////값의 확인 - get()
		// 가능 - System.out.println(list.get(1));
		String n = list.get(0);
		System.out.println(n);

		// 값의 수정 - set()
		// 가능 - System.out.println(list.set(4, "홍순자"));
		list.set(4, "홍순자");
		System.out.println(list.toString());
		
		// 값의 삭제 - remove()
		list.remove(0);
		list.remove("신사임당");
		System.out.println(list.toString());
		
		// 값의 여부 - contains()
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음");
		}
		
		// 빈 리스트의 확인 - isEmpty()
		if(list.isEmpty()) {
			System.out.println("리스트가 비어있음");
		} else {
			System.out.println("리스트가 비어있지 않음");
		}
		
		// 전부삭제 clear()
		list.clear();
		System.out.println(list.toString());
		
		System.out.println("==============================================");
		
		// list.addAll(Collection<? extends String>c):boolean - List
		// 제네릭<?> -> 제네릭에 뭐든 다 들어갈 수 있다
		
		// 제네렉<? extends String> -> String과 String의 자식들 전달가능
		
		// 제네릭<? super String> -> String타입이 될 수ㅠ 있다면 전달가능
		
		List<String> list2 = Arrays.asList("a", "b", "c", "d");
		System.out.println(list2.toString());
		
		// 리스트를 병합 - 값이 있든 없든 마지막에 2개 병합
		list.addAll(list2);
		System.out.println(list.toString());
		
		
		
	}

}
