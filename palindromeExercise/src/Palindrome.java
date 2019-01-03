public class Palindrome {

	public static void main(String a[]) {
		Palindrome s = new Palindrome();
		long number = 113;
		for (int i = 1;; i++) {
			if (s.checkPalindrome(number + i)) {
				System.out.println("nearest palindome is"+ (number+i));
				break;
			}
			if (s.checkPalindrome(number - i)) {
				System.out.println("nearest palindome is"+ (number-i));
				break;
			}
		}
	}

	boolean checkPalindrome(long number) {
		long copy = number;
		long reverse = 0;
		while (copy > 0) {
			reverse = copy % 10 + reverse * 10;
			copy = copy / 10;
		}
		return reverse == number;
	}

}