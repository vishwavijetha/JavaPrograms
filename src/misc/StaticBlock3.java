package misc;

public class StaticBlock3 {
	
	static {
		System.out.println("Static");
	}
	
	{
		System.out.println("Instance initialization");
	}
	
	public StaticBlock3() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main");
		new StaticBlock3();
		new StaticBlock3();
		
	}
}
