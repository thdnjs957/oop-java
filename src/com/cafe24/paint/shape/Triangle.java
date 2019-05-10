package com.cafe24.paint.shape;

public class Triangle extends Shape{
	
	private int x1;
	private int x2;
	private int x3;
	private int y1;
	private int y2;
	private int y3;
	
	@Override
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");//데이터 그냥 무시 귀춘
	}

	@Override
	public float calcArea() {
		return 0.f;
	}
	
}
