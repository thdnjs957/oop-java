package com.cafe24.paint.main;

import com.cafe24.paint.i.Drawable;
import com.cafe24.paint.point.ColorPoint;
import com.cafe24.paint.point.Point;
import com.cafe24.paint.shape.Circle;
import com.cafe24.paint.shape.Rect;
import com.cafe24.paint.shape.Triangle;
import com.cafe24.paint.text.GraphicString;

public class MainApp {
	//point 까지 포함하는 메소드를 하려면 interface를 해야함 
	public static void main(String[] args) {
		
		Point p1 = new Point(10,20);
		draw(p1);
		
		Point p2 = new ColorPoint(50,100,"red"); //부모 메서드 무시하고 자식 메소드 호출
		
		draw(p2);
		
		p2.show(true);//코드재사용으로 해결 
		
		p1.show(false);
		p2.show(false);
		

		Triangle triangle = new Triangle();
		draw(triangle);
		
		Rect rect = new Rect();
		draw(rect);
		
		Circle circle = new Circle();
		draw(circle);
		
		GraphicString string = new GraphicString("hello");
		draw(string);
	}

	
	//밑 두 메소드는 인터페이스로 draw를 빼서 밑 세번째 함수 하나로 합칠수 있음
//	public static void drawPoint(Point point) {
//		point.show();
//	}
//	
//	public static void draw(Shape shape) {
//		shape.draw();
//	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	
	//이 밑은 바보같은 코드
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	public static void drawCircle(Circle circle) {
//		circle.draw();
//	}
	
}
