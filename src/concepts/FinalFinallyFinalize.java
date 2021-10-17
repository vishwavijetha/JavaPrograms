package concepts;

class Parent {
	public static final int price = 100;
}
class Child extends Parent {

}


public class FinalFinallyFinalize {
	
	@Override
	public void finalize() {
		// TODO Auto-generated method stub
		System.out.println("finalize method called for gc");
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		// parent.price = 30; throws error since it is declared as final
		try {
			int a = 10/0;
		} catch (Exception e) {
			System.out.println("Execption: " + e.getLocalizedMessage());
		} finally {
			System.out.println("I will execute no matter what");
		}
		
		FinalFinallyFinalize f = new FinalFinallyFinalize();
		f = null;
		System.gc(); // call finalize method
		System.out.println();
	}

}
