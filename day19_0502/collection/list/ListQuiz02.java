package day19_0502.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<User> list = new ArrayList<>();	//배열 대체
		
		while(true) {
			
			System.out.println("[1.등록] | [2.회원정보 확인] | [3.회원정보 검색] | [4.회원정보 삭제] | [5.종료]");
			System.out.print("메뉴(번호)>");
		
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1: 
				// 이름, 나이를 입력 받아서 user객체에 저장, 리스트에 순서대로 추가
					
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.println("나이 입력 : ");
					int age = sc.nextInt();
					
					User u = new User(name, age);
					
					list.add(u);
					
					System.out.println("정상 입력 되었습니다.");
					
					break;
				
			case 2: 
				// 리스트에 담긴 모든 회원 이름, 나이를 출력
				for(User u2 : list) {
					System.out.println(u2.getName() + " " + u2.getAge());
				}
//				for(int i = 0; i < list.size(); i++) {
//					User u2 = list.get(i);
//					System.out.println(i + 1 + "번 회원 리스트 : " + u.getName() + u.getAge());
//				}
				
				break;
				
			case 3: 
				// 찾을 이름을 새롭게 입력받아서, 이름이 있다면 이름과 나이를 출력
				// 조건 - 찾을 이름이 없다면 "~~~는 목록에 없습니다" 출력
				System.out.println("찾을 이름 : ");
				String newName = sc.next();
				
				boolean bool = true;
				
				for(int i = 0; i < list.size(); i++) {
					
					User u3 = list.get(i);	// 메서드 다시 공부해라
					String n = u3.getName();
					
					if(newName.equals(n)) {
						System.out.print(u3.getName() + " " + u3.getAge());
						bool = false;	// 실행했음
						break;
						} 
					}
				if(bool) {
					System.out.println("찾는 이름은 없습니다");
				}
				
				break;
				
			case 4: 
				// 삭제 할 이름을 입력받아서, 이름과 동일한 User객체를 1개만 삭제
				System.out.println("삭제 할 이름 : ");
				String delName = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					
					User del = list.get(i);
					String n = del.getName();
					
					if(delName.equals(n)) {
						list.remove(i);
						break;
					}
				}
				break;
				
			case 5: 
				System.out.println("종료");
				System.exit(0);
				break;
				
			default:
				System.out.println("다시 입력");
				break;
			
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
