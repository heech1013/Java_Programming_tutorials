/* �߻�(Abstract) Ŭ����
 * �߻� Ŭ������ ����Ϸ��� �� ����� �޾ƾ� �Ѵ�.
 * ��� ���� ��� �߻� �޼ҵ�� �ݵ�� ������ ���־�� �Ѵ�.
 * 
 * �߻� Ŭ������ �����ٸ� �̸� � ����� ���� �޼ҵ带 �߻������� ���, ����� �� �޼ҵ带 ������ �����ؾ� �� ���̴�.
     �߻� Ŭ���� ���п� �̸� ����, ��ü�� �����س��� � �޼ҵ带 �����ؾ� �ϴ��� �� �� �ֱ� ������ ȿ������, ������ ���α׷����� ���´�.
 */
public class Main extends Player {  // ���� ���� �ø� �� implement something.. ������ �ڵ����� �޼ҵ� ���� ����.

	public static void main(String[] args) {

		/* static���� ����� �޼ҵ�(main) ������ �ٸ� �޼ҵ�(play)�� �ҷ�������
		 * �� �޼ҵ� ���� static���� ������ �Ǿ� �־�� �Ѵ�.
		 * ������ play("ALOHA - Cool"); �̷��� ���� ���� �Ʒ�ó��.. */
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
