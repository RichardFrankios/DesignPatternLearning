package wsj.dp.factory;

import com.sun.org.apache.regexp.internal.recompile;

/**
 * @author wsj
 * 形状工厂类,用于创建具体类.
 */
public class ShapeFactory {
	// 矩形
	public static final String RECTANGLE = "rectangle";
	// 正方型
	public static final String SQUARE = "square";
	// 圆形
	public static final String CIRCLE = "circle";
	
	/**
	 * 构造图形的工厂方法.
	 * @param shapeType 图形类型.
	 * @return
	 */
	public static Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase(RECTANGLE)) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase(SQUARE)) {
			return new Square();
		} else if (shapeType.equalsIgnoreCase(CIRCLE)) {
			return new Circle();
		} 
		return null;
	}
}
