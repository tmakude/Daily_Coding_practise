package New_Start;

public class SingletonClass {

	private static final SingletonClass instance = new SingletonClass();

	private SingletonClass() {
		super();

	}

	public static SingletonClass getInstance() {
		return instance;
	}

}
