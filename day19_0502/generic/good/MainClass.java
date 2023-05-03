package day19_0502.generic.good;

public class MainClass {

	public static void main(String[] args) {

		// 제네릭타입은 원시타입X
		//Integer로 사용해야 된다
		//ABC<int> abc4 = new ABC<>();
		
		ABC<String> abc = new ABC<String>(); 
		abc.setT("String 타입을 가져온다");
		String name = abc.getT();
		System.out.println(name);
		
		ABC<Person> abc2 = new ABC<>();	//생성자 꺽쇠는 생략가능
		abc2.setT(new Person());
		Person p = abc2.getT();
		System.out.println("Person 객체를 가져온다 : " + p);
		
		ABC<Object> abc3 = new ABC<>();
		abc3.setT(new Object());
		Object o = abc3.getT();
		System.out.println("Object 객체를 가져온다" + o);
		
		
	/////////////////////////////////////////////////////////////
		
		// 멀티 제네릭
		DEF<Integer, String> def = new DEF<>();

	
	
	}

}
