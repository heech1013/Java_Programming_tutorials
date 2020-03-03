
public class Person {
	
	private String name;
	private int age;
	private int height;
	private int weight;
	
	/* getX() 식으로 private 값에 접근하는 것은 java에서 권장하고 또 많이 쓰이는 방식.
	 * 때문에 eclipse에서 기본적으로 자동 getter, setter 함수를 생성해주는 기능을 가지고 있다.
	 * 마우스 우클릭 -> Source -> generate getters and setters */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	/* 생성자 또한 eclipse에서 자동으로 만들어줌.
	 * 마우스 우클릭 -> Source -> Generate Constructor using Fields */
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	
}
