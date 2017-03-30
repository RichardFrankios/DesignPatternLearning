package wsj.dp.singleton;

/**
 * @author wsj
 * 单例模式测试程序入口
 */
public class SingletonMain {

	public static void main(String[] args) {
		// 1. 获取唯一对象.
		SingletonOne s1 = SingletonOne.getInstance();
		SingletonOne s2 = SingletonOne.getInstance();
		s1.name = "通过 s1 修改name字段";
		// 2. 打印地址
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
	}
}
