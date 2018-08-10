package singelTonPattern;

//A normal class where we will try to instantiate class SingletonClassExample

public class LetsTryToInstaltiateSingletonClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instantiating Singleton class first time
		SingletonClassExample first = SingletonClassExample.getInstanceOfSingletonClassExample();

		// instantiating Singleton class second time
		SingletonClassExample second = SingletonClassExample.getInstanceOfSingletonClassExample();

	}

}
