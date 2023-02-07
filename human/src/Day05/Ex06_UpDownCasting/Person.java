package Day05.Ex06_UpDownCasting;

public class Person {

	String name;
	int age;
	// Alt + Shift + S -> Generate Constructor using Fields -> deselect all -> generate
	public Person() {
		this("이름없음", 0);
	}
	// Alt + Shift + S -> Generate Constructor using Fields -> select all -> generate
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String work() {
		return "일을 합니다.";
	}

	// Source -> Generate toString -> genreate
	// 또는 Alt + Shift + S -> Generate toString -> generate
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
