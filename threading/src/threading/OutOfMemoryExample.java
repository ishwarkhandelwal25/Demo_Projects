package threading;



public class OutOfMemoryExample {
 
	public static void main(String[] args) throws Exception {
		OutOfMemoryExample memoryTest = new OutOfMemoryExample();
		//memoryTest.generateOOM();
		memoryTest.generateOOM2();
	}
 
	public void generateOOM() throws Exception {
		
		int iteratorValue = 20;
		System.out.println("\n=================> OOM test started..\n");
		for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
			System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
			int loop1 = 2;
			int[] memoryFillIntVar = new int[iteratorValue];
			System.out.println(memoryFillIntVar.length);
			// feel memoryFillIntVar array in loop..
			do {
				memoryFillIntVar[loop1] = 0;
				System.out.println("Iteration " + loop1 + " Free Mem: " + Runtime.getRuntime().freeMemory());
				loop1--;
			} while (loop1 > 0);
			iteratorValue = iteratorValue * 5;
			Thread.sleep(1000);
		}
	}
	
	public void generateOOM2() throws Exception{
		int size=1;
		for (int i=0;i<20 ; i++ ) {
			int a[] = new int[size];
			size = size * 100;
			System.out.println("Free Mem: " + Runtime.getRuntime().freeMemory());
		}
	}
 
}