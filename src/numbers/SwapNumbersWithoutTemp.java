package numbers;

public class SwapNumbersWithoutTemp {

	public static void main(String[] args) {

		int n1 = 10, n2 = 20;
		n2 = n1 + n2; // 30
		n1 = n2 - n1;// 20
		n2 = n2 - n1;// 10
		System.out.println(n1 + ", " + n2);
	}

}
