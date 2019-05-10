package object.test;

public class ObjectTest01 {

	public static void main(String[] args) {
		
		Point p = new Point(10,20);
		
		System.out.println(p.getClass()); // reflection 객체가 어떤 클래스에서 생성됐는지 그리고 그 클래스 정보를 알아보는것
		System.out.println(p.hashCode()); // reference 값은 아닌것 같음 
									      // 그럼 실제 주소냐? 그건 더 아닌거 같다
										  // address 기반의 hashing 값
		
		System.out.println(p) ;// 이거는 자동으로 p.toString을 내부적으로 부름
							   //getClass + "@" + hashCode()
	}
}
