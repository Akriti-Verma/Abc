package practice;
interface I1{
	public static final int a=5;
	abstract void show();
	//default void display() {
//		static void display() {
//	}
}
interface I2{
	void display();
}

public class INTERFACE implements  I1,I2 {
	public void show ()
	{
		System.out.println("1");
	}
	public void display() {
		System.out.println("2");
	}
	public static void main(String[] args) {
		
	
	INTERFACE i=new INTERFACE();
	i.show();
	i.display();
}
}