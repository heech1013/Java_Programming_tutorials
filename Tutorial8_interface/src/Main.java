/* 인터페이스 Interface
 * abstract와 유사한 개념이지만 다름.
 * 추상 클래스는 추상 메소드 외에 멤버 변수나 일반 메소드를 가질 수 있지만
 * 인터페이스는 반드시 사전에 정의된 추상 메소드와 상수만을 가질 수 있다.
 * 인터페이스는 다중 상속을 가능케 한다. */

/* Dog, Cat이 모두 interface.. 다중상속이 가능하다.
 * Dog이나 Cat이 abstract인 경우에는 다중 상속이 불가능하다. */
public class Main implements Dog, Cat {  // interface는 implement를 통해 상속

	public static void main(String[] args) {


	}

	/* interface에서 선언된, 반드시 구현해주어야 하는 메소드 목록 */
	@Override
	public void crying() {
		System.out.println("bow bow!");
		
	}
	
	@Override
	public void show() {
		System.out.println("hello world.");
		
	}
	

	@Override
	public void two() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		
	}

}
