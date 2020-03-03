// ���� ���̴� class�� Node: Ư�� ������ ��ǥ�� ��ġ�� ��Ÿ���⵵ �ϰ�, �����˻�Ʈ�������� node�� ��Ÿ���⵵ �Ѵ�.
public class Node {

//	private: �ܺο��� �� ���� ������ �� ����
//  java�� ��ü������ �������� ��ġ�� �ſ� �߿��ϴ�(?)
	private int x;
	private int y;
	
	public int getX() {  // private�� �Լ��� ���� �ܺο��� ������ �� �ֵ��� �Ѵ�.
		return x;
	}
	
	public void setX(int x) {
//		this.x: �ڽ��� ������ �ִ� ������ x. �� ��ܿ� ����� private x�� ����. 
		this.x = x ;  // private x�� ���� �Ķ���ͷ� ���� x ������ �ٲ��ش�.
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) { 
		this.y = y ;
	}
	/* Main���� Node�� ���ؼ� x�� y�� ������ �� �ִ�. ���� ������ �� ���� Node�� �����ϴ� �Լ��� ���� ���� ����.
	 * �̰��� java���� �����ϴ� ��ü���� ���α׷����� �������� ����.
	 */
	
//  ������: ��ü, �ν��Ͻ��� ���� �� ���� �ʱ�ȭ���ش�. Ŭ������ ������ �̸��� ������ ���� Ư¡.
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) {  // �ٸ� Node�� �޾� �� ������ �Ÿ��� ��Ÿ���� Node�� ��ȯ�ϴ� �Լ�
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2 );
	}
}

