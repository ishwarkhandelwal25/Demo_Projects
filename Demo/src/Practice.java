public class Practice {

	public static void m1() {

		try {

			throw new IllegalArgumentException("exce");

		} catch (ArithmeticException e) {

			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		m1();

	}

}
