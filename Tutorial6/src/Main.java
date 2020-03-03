/* 추상(Abstract) 클래스
 * 추상 클래스를 사용하려면 꼭 상속을 받아야 한다.
 * 상속 받은 모든 추상 메소드는 반드시 구현을 해주어야 한다.
 * 
 * 추상 클래스가 없었다면 미리 어떤 개념과 하위 메소드를 추상적으로 상상, 기억한 뒤 메소드를 일일이 선언해야 할 것이다.
     추상 클래스 덕분에 미리 개념, 객체를 선언해놓고 어떤 메소드를 선언해야 하는지 알 수 있기 때문에 효율적인, 안전한 프로그래밍을 돕는다.
 */
public class Main extends Player {  // 빨간 밑줄 올린 후 implement something.. 누르면 자동으로 메소드 구현 생성.

	public static void main(String[] args) {

		/* static으로 선언된 메소드(main) 내에서 다른 메소드(play)를 불러오려면
		 * 그 메소드 역시 static으로 선언이 되어 있어야 한다.
		 * 때문에 play("ALOHA - Cool"); 이렇게 하지 말구 아래처럼.. */
		Main main = new Main();
		main.play("ALOHA - Cool");
		
	}

	@Override
	void play(String songName) {
		System.out.println(songName + "play this song..");
	}

	@Override
	void pause() {

		
	}

	@Override
	void stop() {

		
	}

}
