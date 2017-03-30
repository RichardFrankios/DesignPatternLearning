package wsj.dp.singleton;

/**
 * @author wsj
 * 登记式/静态内部类
 * 线程安全
 */
public class SingletonFive {
	// 静态内部类,只有当被显示调用时才会被加载,也达到了延时加载的目的.
	private static class SingletonHolder {
		private static SingletonFive instance = new SingletonFive();
	}
	public SingletonFive() {	}
	// 接口.
	public static SingletonFive getInstance() {
		return SingletonHolder.instance;
	}
}
