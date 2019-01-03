
class SingletonDemo {

	private static SingletonDemo s;

	private SingletonDemo() {

	}

	public static SingletonDemo getInstance() {
		if (s == null) {
			synchronized (SingletonDemo.class) {
				if (s == null) {
					s = new SingletonDemo();
				}
			}
		}
		return s;
	}

}

public class SingletonDemoExample {
	public static void main(String args[]) {
		SingletonDemo s1 = SingletonDemo.getInstance();
		SingletonDemo s2 = SingletonDemo.getInstance();
		SingletonDemo s3 = SingletonDemo.getInstance();
		SingletonEnum a = SingletonEnum.Instance;
		SingletonEnum b = SingletonEnum.Instance;
		SingletonEnum c = SingletonEnum.Instance;
		SingletonEnum d = SingletonEnum.Instance;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		ConcurrentHashMap m = new Co
		
	}

}
