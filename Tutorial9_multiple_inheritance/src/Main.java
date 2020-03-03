/* 인터페이스 Interface
 * abstract와 유사한 개념이지만 다름.
 * 추상 클래스는 추상 메소드 외에 멤버 변수나 일반 메소드를 가질 수 있지만
 * 인터페이스는 반드시 사전에 정의된 추상 메소드와 상수만을 가질 수 있다.
 * 인터페이스는 다중 상속을 가능케 한다. */

//public class Main extends Dog, Cat {  // 다중 상속 불가
public class Main extends Dog {

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();

	}

	/* interface에서 선언된, 반드시 구현해주어야 하는 메소드 목록 */
	@Override
	public void crying() {
		System.out.println("bow bow!");
		
	}
	
	

}
