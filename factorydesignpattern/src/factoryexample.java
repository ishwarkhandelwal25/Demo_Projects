
abstract class home {
	String name;

	abstract void getName();

	public void printName() {
		System.out.println(name);
	}

}

class flat extends home {
	void getName() {
		name = "ish";
	}

}

class rent extends home {

	void getName() {
		name = "sid";
	}

}

class factory {

	public static home getHome(String m) {
		if (m == null) {
			return null;
		}
		if (m.equals("flat")) {
			return new flat();
		}
		if (m.equals("rent")) {
			return new rent();
		}
		return null;
	}

}

public class factoryexample {
	public static void main(String args[]) {

		home m = factory.getHome("rent");
		m.getName();
		m.printName();
	}
}
