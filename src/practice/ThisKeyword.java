package practice;
public class ThisKeyword {	
	
	// this keyword is used to invoke current class instance variable
	int i;
	void setValue(int i) {
		this.i=i;
	}
	void show() {
		System.out.println(i);
	}
 
 

public static void main(String[] args) {
	ThisKeyword x=new ThisKeyword();
	x.setValue(10);
	x.show();
}
	}
