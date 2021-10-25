package misc;

public class StaticBlock1 {

	public static void main(String[] args) {
		System.out.println(MyClass.x); // Static block will not be executed because of final
		System.out.println(MyClass.y); // Static block will be executed first
		
		StaticBlock2 staticBlock2 = new StaticBlock2();
	}
}

class MyClass {
	public static final int x = 100;
	public static int y = 100;
	static {
		System.out.println("Static Block called");
	}
}
