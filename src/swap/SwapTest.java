package swap;

public class SwapTest {

	public static void main(String[] args) {
		
		//method call by (파라미터를 넘길때 얘기다)
		
		int a = 10;
		int b = 20;
		
		//java는 무조건 객체로 넘겨야 reference 넘기는게 가능
		
		
		System.out.println(a + " : " + b);
		swap(a,b);
		System.out.println(a + " : " + b);
	
		Value v1 = new Value();
		v1.val = 10;
		Value v2 = new Value();
		v2.val = 20;
		
		System.out.println(v1.val + ":" + v2.val);
		swap(v1,v2);
		System.out.println(v1.val + ":" + v2.val);
		
	}
	
	private static void swap(Value m, Value n) {
		
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
		
	}
	
	
	private static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	
	
	
	
}
