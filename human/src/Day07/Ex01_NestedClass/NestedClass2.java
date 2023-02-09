package Day07.Ex01_NestedClass;

public class NestedClass2 {

	public static void main(String[] args) {
		X x = new X();
		
		// 인스턴스 멤버 클래스 객체 생성
		X.Y y = x.new Y();
		y.value1 = 10;
		System.out.println("X의 Y의 객체 변수 - " +  y.value1);
		y.method1();
		
		// static 멤버 클래스 객체 생성
		X.Z z = new X.Z();
		z.value1 = 20;
		System.out.println("X의 Z 객체 변수 - " + y.value1);
		System.out.println("X의 Z객체 static 변수 - " + X.Z.value2);
		z.method1();
		X.Z.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		x.method();	// 내부에서 L 객체 생성
		
		
		
		
	}

}
