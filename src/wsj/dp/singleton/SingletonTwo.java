package wsj.dp.singleton;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author wsj
 * 懒汉式,不支持多线程.
 */
public class SingletonTwo {
	// 持有唯一对象
	private static SingletonTwo instance;
	// 屏蔽构造方法
	private SingletonTwo() {}
	// 获取对象接口
	public static SingletonTwo getInstance() {
		if (instance == null) {
			instance = new SingletonTwo();
		}
		return instance;
	}
}
