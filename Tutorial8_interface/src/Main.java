/* �������̽� Interface
 * abstract�� ������ ���������� �ٸ�.
 * �߻� Ŭ������ �߻� �޼ҵ� �ܿ� ��� ������ �Ϲ� �޼ҵ带 ���� �� ������
 * �������̽��� �ݵ�� ������ ���ǵ� �߻� �޼ҵ�� ������� ���� �� �ִ�.
 * �������̽��� ���� ����� ������ �Ѵ�. */

/* Dog, Cat�� ��� interface.. ���߻���� �����ϴ�.
 * Dog�̳� Cat�� abstract�� ��쿡�� ���� ����� �Ұ����ϴ�. */
public class Main implements Dog, Cat {  // interface�� implement�� ���� ���

	public static void main(String[] args) {


	}

	/* interface���� �����, �ݵ�� �������־�� �ϴ� �޼ҵ� ��� */
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
