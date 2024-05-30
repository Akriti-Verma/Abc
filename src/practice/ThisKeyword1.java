package practice;

public class ThisKeyword1 {

	// this keyword is used to invoke current class method
		
		void display() {
			System.out.println("Hello");
		}
		void show() {
			//display();
			this.display();
		}
	 
	public static void main(String[] args) {
		ThisKeyword1 x=new ThisKeyword1();
          x.show();
	}

}
