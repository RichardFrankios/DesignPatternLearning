package wsj.dp.factory;

public class FactoryMain {

	public static void main(String[] args) {
		System.out.println("工厂模式");
		// 1. 获取Rectangle对象并调用draw方法
		Shape rectangle = ShapeFactory.getShape(ShapeFactory.RECTANGLE);
		rectangle.draw();
		
		// 2. Circle
		Shape circle = ShapeFactory.getShape(ShapeFactory.CIRCLE);
		circle.draw();
		
		// 3. square
		Shape square = ShapeFactory.getShape(ShapeFactory.SQUARE);
		square.draw();
		
	}

}
