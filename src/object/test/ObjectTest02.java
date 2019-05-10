package object.test;

public class ObjectTest02 {
	public static void main(String[] args) {
		
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		// == 이거는 두 객체가 같은 객체냐?같은 객체를 가리키냐? ( 동일성 ) 
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
	
		// equals  이거는 두 객체의 동질성을 비교한다. 쉽게 말해서 내용 비교
		//Object의 equals() 구현은 == 과 똑같다 f11눌러서 확인
		
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
		// String
		String str1 = new String("ABC");
		String str2 = new String("ABC");
		
		System.out.println( str1 == str2 );
		System.out.println(str1.equals(str2));
		//오버라이드 해서 내용기반으로 되버리니깐 똑같이 나옴
		System.out.println(str1.hashCode() + ":" + str2.hashCode());

		//주소 기반의 해쉬코드는 다르다 오버라이드 되기 전에 있던 놈
		System.out.println(System.identityHashCode(str1) + ":" + System.identityHashCode(str2));
		
		
		//이렇게 쓰는게 자원 절약임
		//이건 다 같게 나와버림!!! -> 이유는 누가 개입을 함 
		String str3 = "ABC";
		String str4 = "ABC";
		
		System.out.println( str3 == str4 );
		System.out.println(str3.equals(str4));
		System.out.println(str3.hashCode() + ":" + str4.hashCode());
		System.out.println(System.identityHashCode(str3) + ":" + System.identityHashCode(str4));
		
	}
	
}
