package com.cafe24.paint.point;

import com.cafe24.paint.i.Drawable;

public class Point implements Drawable {
	
	protected int x; //getter,setter 귀춘해서
	protected int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.println("점("+x+","+y+")에 점을 찍었습니다.");
	}

	public void show(boolean visible) { // 이렇게 하면 이름을 diappear하는것보다 훨 편함
		
		if(visible) {
			//System.out.println("점("+x+","+y+")에 점을 찍었습니다.");
			show(); // 코드 재사용!! 중요
			return;
		}
		System.out.println("점("+x+","+y+")에 점을 지웠습니다.");
	}

	@Override
	public void draw() {
		show();
	}

}
