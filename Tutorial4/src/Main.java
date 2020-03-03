import java.util.Scanner;

public class Main {
	
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // 관련 모듈 import 단축기: ctrl+shift+o
		System.out.print("input the size of array : ");
		int number = sc.nextInt();
		int[] array = new int[number];
		for (int i = 0; i < number; i ++) {
			System.out.print("input integer putting in array one by one : ");
			array[i] = sc.nextInt();
		}
		sc.close();
		
		int result = -1;
		for (int i = 0; i < number; i ++) {
			result = max(result, array[i]);
		}
		System.out.println("the biggist number: " + result);
	}

}
