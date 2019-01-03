
interface TargetInterface {
	void doAction();
}

 class Adaptee{
	 public void showAction() {
		 System.out.println("yes");
	 }
	 
 }
 
 class Adapter extends Adaptee implements TargetInterface {
	  @Override
	public void doAction() {
		showAction();
		
	}
 }


public class AdapterDesignexample {

	public static void main(String ar[]) {
		
		Adapter adapter = new Adapter();
		adapter.doAction();
	}
	
	
	
}
