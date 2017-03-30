package wsj.dp.singleton;

/**
 * @author wsj
 * 单例类,恶汉式
 */
public class SingletonOne {
	
	// 成员对象.
	public String name = "Design Pattern Learning";
	// 创建一个SingletonOne的一个对象
	private static SingletonOne instance = new SingletonOne();
	// 屏蔽构造方法
	public SingletonOne() {}
	// 提供获取唯一对象的接口
	public static SingletonOne getInstance() {
		return instance;
	}
}
