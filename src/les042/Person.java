package les042;

public abstract class Person {
	String name;
	final public static int INCREASE_CAP = 20;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return "Person's name is " + name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract boolean increasePay(int percent);

}
