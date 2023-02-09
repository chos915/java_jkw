package Day04.Ex02_Calculator;

/**
 * 계산기
 * - 피연산자를 2개로 하는 계산기
 * - 기능
 * 		1. 덧셈		: 정수 2개를 덧셈
 * 		2. 뺄셈		: 정수 인자1 - 인자2 연산하는 뺄셈
 * 		3. 곱셈		: 실수 2개를 곱셈
 * 		4. 나눗셈		: 실수 인자1 / 인자2 연산하는 나눗셈
 * 		5. 나머지		: 정수 인자1 % 인자2 연산하는 나머지 연산
 * 		6. 합계		: 배열을 매개변수로 전달받아, 모든 요소의 합을 구함
 * 		7. 평균		: 배열을 매개변수로 전달받아, 평균을 구함
 * @author LG
 *
 */
public class Calculator {

	// 덧셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	// 뺄셈
	public int minus(int a , int b) {
		int result = a - b;
		return result;
	}
	
	// 곱셈
	public double multiple(double a, double b) {
		double result = a * b;
		return result;
	}
	
	// 나눗셈
	public double devide(double a, double b) {
		double result = a / b;
		return result;
	}
	
	// 나머지
	public int remain(int a, int b) {
		int result = a % b;
		return result;
	}
	
	//합계
	public int sum(int arr[]) {	
	 int sum = 0;
	 for (int i : arr) {
		sum += i;
	 	}
	 return sum;
	}
	
	// 평균 - (합계) / (개수)
	public double avg(int arr[]) {
		int sum = sum(arr);
		double avg = (double) sum / arr.length;
		return avg;
	}
}

