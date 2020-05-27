package VectorTest;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vector = new Vector<String>(3);
		
		System.out.println("벡터의 크기 : " + vector.size() );
		System.out.println("벡터의 용량 : " + vector.capacity());
		
		vector.addElement("가");
		vector.addElement("나");
		vector.addElement("다");

		System.out.println("데이터 삽입 후 벡터의 크기 : " + vector.size() );
		System.out.println("데이터 삽입 후 벡터의 용량 : " + vector.capacity());
		
		//벡터가 가득찬상태에서 하나를 더 삽입하면 size+1, 용량+capacity
		vector.addElement("라");
		
		System.out.println("데이터 하나 더 삽입 후 벡터의 크기 : " + vector.size() );
		System.out.println("데이터 하나 더 삽입 후 벡터의 용량 : " + vector.capacity());
		System.out.println(vector);
		
		System.out.println(vector.elementAt(0));
		vector.removeAllElements();

		//사이즈는 줄어들지만 용량은 줄어들지않음
		System.out.println("데이터 삭제 후 벡터의 크기 : " + vector.size() );
		System.out.println("데이터 삭제 후 벡터의 용량 : " + vector.capacity());
		
	}

}
