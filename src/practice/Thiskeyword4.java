package practice;

public class Thiskeyword4 {
	
	// this keyword can be used to pass as an argument in method call
	
	void m1(Thiskeyword4 td) {
		System.out.println("I am in m1 method");
	}
	void m2() {
		m1(this);
	}

	public static void main(String[] args) {
		Thiskeyword4 t=new Thiskeyword4();
               t.m2();
	}

}
