// 자주 쓰이는 class인 Node: 특정 지점의 좌표나 위치를 나타내기도 하고, 이진검색트리에서의 node를 나타내기도 한다.
public class Node {

//	private: 외부에서 한 번에 접근할 수 없음
//  java의 객체지향은 보안적인 조치가 매우 중요하다(?)
	private int x;
	private int y;
	
	public int getX() {  // private를 함수를 통해 외부에서 접근할 수 있도록 한다.
		return x;
	}
	
	public void setX(int x) {
//		this.x: 자신이 가지고 있는 고유의 x. 즉 상단에 선언된 private x를 말함. 
		this.x = x ;  // private x의 값을 파라미터로 들어온 x 값으로 바꿔준다.
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) { 
		this.y = y ;
	}
	/* Main에서 Node를 통해서 x와 y에 접근할 수 있다. 직접 접근할 수 없고 Node가 제공하는 함수를 통해 접근 가능.
	 * 이것이 java에서 제공하는 객체지향 프로그래밍으 기초적인 형태.
	 */
	
//  생성자: 객체, 인스턴스를 만들 때 값을 초기화해준다. 클래스와 동일한 이름을 가지는 것이 특징.
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {  // 다른 Node를 받아 둘 사이의 거리를 나타내는 Node를 반환하는 함수
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2 );
	}
}

