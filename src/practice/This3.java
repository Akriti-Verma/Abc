package practice;

public class This3 {
	
	// this() keyword can be used to  invoke current class constructor
	This3(){
		// this(12);  
		System.out.println("no arg constructor");
	}
	This3(int a){
		this();
		System.out.println("paramerized constructor");
	}
	public static void main(String[] args) {
		This3 t=new This3(10);
		
	}

}
