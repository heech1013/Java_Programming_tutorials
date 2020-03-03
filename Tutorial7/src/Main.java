/* Final
 * ���� ������ �ʴ� Ư���� ���� ���� ��.
 * ����, �޼ҵ�, Ŭ������ ��� ��� ����.
 * ���� -> ������ �ʴ� ����� ��. Stop Value Change.
 * �޼ҵ� -> �����ǰ� �Ұ����� �޼ҵ尡 ��. Stop Method Overridding.
 * Ŭ���� -> ����� �Ұ����� �ϳ��� ������ Ŭ������ ��. Stop Inheritance. */

//public class Main extends Parent {  // final�� ����� class�� Parent�κ��� ��� ���� �� ����. ����.
public class Main {
	
	public void show() {  // overriding - show() ����ϸ� ���� �����ǵ� �Լ��� ������ �ȴ�.
		System.out.println("Hello");
	}
	
//	public void show2() {  // overriding �� �� ����. - final
//		System.out.println("Hello");
//	}

	public static void main(String[] args) {
		
		final int number = 10;  // ����� ��.
//		number = 5;  // ����
		System.out.println(number);

		Main main = new Main();
		main.show();
	}

}
