import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner: java���� ������� �����ϰԲ� �����ִ� �⺻ ���̺귯��. ���̺귯���� import�ؾ� �Ѵ�.
		Scanner sc = new Scanner(System.in);  // ����� ������� �޾� ��Ʈ���Ѵ�.
		System.out.print("������ �Է��ϼ��� : ");
//		����ڰ� �Է��ϴ� int �����͸� �޾� i1�� ����.
		int i1 = sc.nextInt();
		System.out.println("�Էµ� ������ " + i1 + "�Դϴ�.");
//		������� �����ϴ� ���� sc�� �ݾ� ���α׷��� �����ϰ� ����� �� �ֵ��� �Ѵ�.
		sc.close();
		
		/* ���� ����� */
		File file = new File("input.txt");  // ������ �о� ��Ʈ�� �� �� �ְ� ���ش�.
		try {
//			java�� ������ ���ų� ���� �� ���� ���� ���ܻ�Ȳ�� ����Ͽ� try catch���� ����ϵ��� �����Ѵ�.
			Scanner sc2 = new Scanner(file);  // ����� ����� ��� ������ �о� ��Ʈ���Ѵ�.
			while(sc2.hasNextInt()) {  // ���Ͽ� ���� �� �ִ� ���� int�� �����Ͱ� �ִ��� ���´�.
				System.out.println(sc2.nextInt());  // �ִ� ��� ���� int�� �����͸� ���.
			}
			sc2.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ �о���� ���߿� ������ �߻��߽��ϴ�.");
		}  
	}

}
