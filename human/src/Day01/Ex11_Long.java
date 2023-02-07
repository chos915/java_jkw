package Day01;

public class Ex11_Long {
	
	public static void main(String[] args) {
		// int (4byte : 4*8bits = 32bits) : 2^32 개	: 42억 개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		// int intMax = 2200000000;(에러)<-- 범위 초과 
		
		// long (8byte : 8*8bits = 64bits) : 2^64 개
		long ln1 = 1000;		// (long타입) = (int타입)
		long ln2 = 2100000000;	// (long타입) = (int타입)
		// long 타입 리터럴 : 숫자L
		long ln3 = 2200000000L;	// 그런데 2200000000은 int타입으로 사용할 수 없는 수이므로 long타입으로 지정해야하고 그 방법이 숫자L
		
		int max = Integer.MAX_VALUE;	// int 형의 최댓값 (21억xxx)
		int min = Integer.MIN_VALUE;	// int 형의 최솟값 (-21억xxx)
		
		System.out.println("int의 최댓값 : " + max);
		System.out.println("int의 최솟값 : " + min);
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
		
	}

}
