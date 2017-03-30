package wsj.dp.singleton;

/**
 * @author wsj
 * 懒汉式,线程安全
 */
public class SingletonThree {
	private static SingletonThree instance;
	public SingletonThree() {	}
	// 上锁保证线程安全.
	public static synchronized SingletonThree getInstance() {
		if (instance == null) {
			instance = new SingletonThree();
		}
		return instance;
	}
}
