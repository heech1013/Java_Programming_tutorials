
public class Main {
	
	final static double PI = 3.141592;
	final static int INT_MAX = 2147483647;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "string something~";
		System.out.println(stringType);
		
		int a1 = INT_MAX;
		System.out.println(a1 + 1);  // overflow
		
		int a2 = (int) 13.5;  // 형 변환
		System.out.println(a2);  // 소숫점 뒤는 잘리고 정수 부분만 저장(13)
		
		for(char i = 'a'; i<= 'z'; i++) {
			System.out.print(i);
		}
		
		System.out.format("\n8진수: %o\n", a2);
		
		System.out.println(stringType.substring(3, 6));
		
		int a3 = 10;
		a3++;
		System.out.println("a: " + a3);
		System.out.println("a: " + ++a3);  // 1 증가 후 출력
		System.out.println("a: " + a3++);  // 출력 후 1 증가
		System.out.println("a: " + a3);
		
		System.out.println(max(50, 60));
		
//		Math.pow(): 거듭제곱 (double -> double)
		a3 = (int)Math.pow(3.0, 20.0);  // 3의 20제곱
		System.out.println(a3);
		
//		string은 class 기반으로 만들어진 비원시자료형이다. 때문에 내부에 여러 함수를 가질 수 있음.
		String s1 = "I love you.";
		if (s1.contains("love")) {
			System.out.println("me too.");
		} else {
			System.out.println("I hate you.");
		}
		
//      java는 String을 비교할 때 equals()를 쓴다. 다른 자료형과 다르게 문자열 자료형이기 때문이다.
		String s2 = "Man";
		if (s2.equals("Man")) {
			System.out.println("He is man.");
		}
//		대소문자 상관 없이 같은지 비교한다.
		if (s2.equalsIgnoreCase("man")) {
			System.out.println("He is man.");
		}
		
		int i1 = 1, sum = 0;
		while (i1 <= 1000) {
			sum += i1++;
		}
		System.out.println(sum);
		
		for (int i2 = 30; i2> 0; i2--) {
			System.out.print(i2);
		}
	}
	
//	static: class 내부에서 사용할 수 있는 객체
//	반환형, 함수 이름, 매개 변수
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}
