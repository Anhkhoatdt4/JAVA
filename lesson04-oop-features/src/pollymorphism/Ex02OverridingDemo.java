package pollymorphism;

public class Ex02OverridingDemo {
	public static void main(String[] args) {
		Ex02OverridingChild child = new Ex02OverridingChild();
		System.out.println(child.text);
		child.log();
	}
}
