
public class Main {
	
	public static int function1(int a, int b, int c) {
		// �Ҷ�Ҷ�
		return 0;
	}
	
//	����Լ�
	public static int factorial(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(function1(1,2,3));
		System.out.println(factorial(10));
	}

}
