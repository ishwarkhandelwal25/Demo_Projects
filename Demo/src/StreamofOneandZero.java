
public class StreamofOneandZero {

	public static void main(String args[]) {

		String number ="1000011";
		char[] a = number.toCharArray();
		int evencount = 0;
		int oddcount = 0;
		for(int i=0; i<a.length; i++) {
			if(i%2 == 0 && a[i] == '1') {
				evencount ++;
			}
			if(i%2 != 0 && a[i] == '1') {
				oddcount ++;
			}
		}
		
		if((evencount - oddcount) % 3 == 0) {
			System.out.println("yes divided");
		}
		else {
			System.out.println("no");
		}
		
	}
}
