package DesignPattern.SingletonDesignPattern;

class SingletonClass {
	private static SingletonClass singletonClass;

	public static SingletonClass getSingleObject() {
		if (singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}

	@Override
	public String toString() {
		return "Singleton class object";
	}

}

public class SingletonDesignPattern {
	public static void main(String[] args) {
		SingletonClass singleObject = SingletonClass.getSingleObject();
		System.out.println(singleObject);
	}
}
