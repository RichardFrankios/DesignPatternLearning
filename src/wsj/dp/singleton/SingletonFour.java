package wsj.dp.singleton;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author wsj
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 线程安全.
 */
public class SingletonFour {
	private volatile static SingletonFour instance ;
	public SingletonFour() {	}
	// 使用双重锁校验机制
	public static SingletonFour getInstance() {
		if (instance == null) {
			synchronized (SingletonFour.class) {
				if (instance == null) {
					instance = new SingletonFour();		
				}
			}
		}
		return instance;
	}

}
