package misc;

public class StaticBlock2 {

	static {
		System.out.println("Static block 1 executed");
	}

	static {
		System.out.println("Static block 2 executed");
	}
	
	String name;
	static int age;
	
	static {
		StaticBlock2 staticBlock2 = new StaticBlock2();
		staticBlock2.name = "Vishwa";
		age = 25;
		System.out.println(staticBlock2.name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		System.out.println("Main method executed");
	}

	static {
		System.out.println("Static block 3 executed");
	}

}
