
public class Main {

	public static void main(String[] args) {
		Node one = new Node(10, 20);
		Node two= new Node(30, 40);
		Node result = one.getCenter(two);
		
		System.out.println("x : " + result.getX() + "/ y :" + result.getY());
		
		Student student1 = new Student("È«±æµ¿", 20, 175, 70, "20170101", 1, 4.5);
		Student student2 = new Student("aiden", 20, 175, 70, "20170101", 1, 4.5);
		student1.show();
		student2.show();
		
		Teacher teacher1 = new Teacher("John Doe", 25, 180, 120, "AGD1234", 300000, 5);
		Teacher teacher2 = new Teacher("Beak ink", 25, 180, 120, "AGD1234", 300000, 5);
		teacher1.show();
		teacher2.show();
		
//		¹è¿­
		Student[] students = new Student[5];
		for(int i = 0; i < 5; i++) {
			students[i] = new Student("È«±æµ¿", 20, 175, 70, i + "", 1, 4.5);
			students[i].show();
		}
		
	}
}
