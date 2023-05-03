package day19_0502.collection.list;

public class User {

	private String name;
	private String age;

	// 생성자
	public User() {
		
	}
	
	public User(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}
