package day19_0502.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {

		//double d = Math.random();
		
		Random r = new Random();
		
		// Random 객체 0이상 1미만
		Double d = r.nextDouble();
		System.out.println(d);
		
		// 정수범위의 랜덤 값
		int x = r.nextInt();
		System.out.println(x);
		
		// 0이상 10미만
		int y = r.nextInt(10);
		System.out.println(y);
	}

}
