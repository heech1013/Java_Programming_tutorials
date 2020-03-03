/* Final
 * 절대 변하지 않는 특정한 것을 정할 때.
 * 변수, 메소드, 클래스에 모두 사용 가능.
 * 변수 -> 변하지 않는 상수가 됨. Stop Value Change.
 * 메소드 -> 재정의가 불가능한 메소드가 됨. Stop Method Overridding.
 * 클래스 -> 상속이 불가능한 하나의 완전한 클래스가 됨. Stop Inheritance. */

//public class Main extends Parent {  // final로 선언된 class인 Parent로부터 상속 받을 수 없다. 오류.
public class Main {
	
	public void show() {  // overriding - show() 사용하면 새로 재정의된 함수로 실행이 된다.
		System.out.println("Hello");
	}
	
//	public void show2() {  // overriding 할 수 없다. - final
//		System.out.println("Hello");
//	}

	public static void main(String[] args) {
		
		final int number = 10;  // 상수가 됨.
//		number = 5;  // 오류
		System.out.println(number);

		Main main = new Main();
		main.show();
	}

}
