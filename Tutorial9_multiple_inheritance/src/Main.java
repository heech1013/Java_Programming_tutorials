/* �������̽� Interface
 * abstract�� ������ ���������� �ٸ�.
 * �߻� Ŭ������ �߻� �޼ҵ� �ܿ� ��� ������ �Ϲ� �޼ҵ带 ���� �� ������
 * �������̽��� �ݵ�� ������ ���ǵ� �߻� �޼ҵ�� ������� ���� �� �ִ�.
 * �������̽��� ���� ����� ������ �Ѵ�. */

//public class Main extends Dog, Cat {  // ���� ��� �Ұ�
public class Main extends Dog {

	public static void main(String[] args) {

		Main main = new Main();
		main.crying();

	}

	/* interface���� �����, �ݵ�� �������־�� �ϴ� �޼ҵ� ��� */
	@Override
	public void crying() {
		System.out.println("bow bow!");
		
	}
	
	

}
