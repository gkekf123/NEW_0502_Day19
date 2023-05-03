package day19_0502.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만
		 *  그 값을 사용할 떄, 알맞은 타입으로 반즈시 형변환을 해야 합니다.
		 *  잘못 혈변환 하면, 예외가 발생한다.
		 */
		
		ABC abc = new ABC();
		abc.setObj("홍길동");	// 문자 숫자 다 가능
		abc.setObj(20);	// 숫자 문자 다 가능
		
		//사용
		String name = (String)abc.getobj();
		System.out.println(name);
		
		ABC abc2 = new ABC();
		abc2.setObj(new Person());	//Person 객체를 저장
		Person p = (Person)abc2.getobj();

		
	
	
	}
	
}
