package test;

interface someInterface{
	void display();
}


public class MethodJava8 {
	public void draw() {
		System.out.println("different");
	}
	public static void main(String[] args) {
		MethodJava8 mi = new MethodJava8();
		someInterface abc = mi::draw;
		abc.display();
		
	}

}
