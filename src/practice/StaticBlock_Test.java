package practice;

public class StaticBlock_Test {
  static int a;
	static {
		System.out.println("Static block 1");
	}
	static {
		a=10;
		System.out.println(a);
		System.out.println("Static block 2");
	}

	public static void main(String[] args) {
		System.out.println("I am in main method");
	}
}
