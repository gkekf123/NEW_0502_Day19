package day19_0502.collection.list;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		
		// 제네릭<?> -> 제네릭에 뭐든 다 들어갈 수 있다
		
		// 제네렉<? extends String> -> String과 String의 자식들 전달가능
				
		// 제네릭<? super String> -> String타입이 될 수 있다면 전달가능

		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		//<?> 다 들어갈 수 있다
		add1(list1); // O
		add1(list2); // X
		add1(list3); // X
		
		// String이거나 String의 자식들
		add2(list1); // String O
		//add2(list2); // Integer X
		//add2(list3); // Object X
		
		add3(list1); // String O
		//add3(list2); // Inteager X
		add3(list3); // Object O
		
	}
	//list를 매개변수로 받는다
	
	public static void add1(List<?> list) { //<?> 다 들어갈 수 있다
		
	}
	
	public static void add2(List<? extends String> list) {	// String이거나 String의 자식들
		
	}
	
	public static void add3(List<? super String> list) {
		
	}
	
}
