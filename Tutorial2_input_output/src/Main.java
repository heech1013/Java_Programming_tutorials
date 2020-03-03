import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner: java에서 입출력이 가능하게끔 도와주는 기본 라이브러리. 라이브러리를 import해야 한다.
		Scanner sc = new Scanner(System.in);  // 사용자 입출력을 받아 컨트롤한다.
		System.out.print("정수를 입력하세요 : ");
//		사용자가 입력하는 int 데이터를 받아 i1에 저장.
		int i1 = sc.nextInt();
		System.out.println("입력된 정수는 " + i1 + "입니다.");
//		입출력을 관장하는 변수 sc를 닫아 프로그램이 안전하게 종료될 수 있도록 한다.
		sc.close();
		
		/* 파일 입출력 */
		File file = new File("input.txt");  // 파일을 읽어 컨트롤 할 수 있게 해준다.
		try {
//			java는 파일이 없거나 읽을 수 없는 등의 예외상황에 대비하여 try catch문을 사용하도록 강제한다.
			Scanner sc2 = new Scanner(file);  // 사용자 입출력 대신 파일을 읽어 컨트롤한다.
			while(sc2.hasNextInt()) {  // 파일에 읽을 수 있는 다음 int형 데이터가 있는지 묻는다.
				System.out.println(sc2.nextInt());  // 있는 경우 다음 int형 데이터를 출력.
			}
			sc2.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다.");
		}  
	}

}
