package practice;

class Test{
	Test(ThisKeyword5 td){
		System.out.println("test class construcrtor");
	}
}
public class ThisKeyword5 {
	// this keyword can be used to pass as an argument in the constructor call
  void m1() {
	  Test t=new Test(this);
  }
	public static void main(String[] args) {
		ThisKeyword5 t=new ThisKeyword5();
		t.m1();
	}

}
