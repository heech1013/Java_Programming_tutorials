
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
		
		int a2 = (int) 13.5;  // �� ��ȯ
		System.out.println(a2);  // �Ҽ��� �ڴ� �߸��� ���� �κи� ����(13)
		
		for(char i = 'a'; i<= 'z'; i++) {
			System.out.print(i);
		}
		
		System.out.format("\n8����: %o\n", a2);
		
		System.out.println(stringType.substring(3, 6));
		
		int a3 = 10;
		a3++;
		System.out.println("a: " + a3);
		System.out.println("a: " + ++a3);  // 1 ���� �� ���
		System.out.println("a: " + a3++);  // ��� �� 1 ����
		System.out.println("a: " + a3);
		
		System.out.println(max(50, 60));
		
//		Math.pow(): �ŵ����� (double -> double)
		a3 = (int)Math.pow(3.0, 20.0);  // 3�� 20����
		System.out.println(a3);
		
//		string�� class ������� ������� ������ڷ����̴�. ������ ���ο� ���� �Լ��� ���� �� ����.
		String s1 = "I love you.";
		if (s1.contains("love")) {
			System.out.println("me too.");
		} else {
			System.out.println("I hate you.");
		}
		
//      java�� String�� ���� �� equals()�� ����. �ٸ� �ڷ����� �ٸ��� ���ڿ� �ڷ����̱� �����̴�.
		String s2 = "Man";
		if (s2.equals("Man")) {
			System.out.println("He is man.");
		}
//		��ҹ��� ��� ���� ������ ���Ѵ�.
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
	
//	static: class ���ο��� ����� �� �ִ� ��ü
//	��ȯ��, �Լ� �̸�, �Ű� ����
	static int max(int a, int b) {
		int result = (a > b) ? a : b;
		return result;
	}

}
