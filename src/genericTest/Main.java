package genericTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric<String> stringType = new TestGeneric<String>();
		TestGeneric<Integer> integerType = new TestGeneric<Integer>();

		stringType.sample = "Hello";
		integerType.sample = 1;

		stringType.showYourType();
		integerType.showYourType();

		TestGeneric2<String, Integer> generic2 = new TestGeneric2<String, Integer>();
		// 복수의 제네릭 설정 가능

		Data<Parent> data = new Data();
		Data<Child> data2 = new Data();
		// Data<String> data3= new Data(); //컴파일 오류가 난다
	}

}

class TestGeneric<T> {
	public T sample;

	public void showYourType() {
		if (sample instanceof Integer)
			System.out.println("Integer 타입");
		else if (sample instanceof String)
			System.out.println("String 타입");
	}
}

class TestGeneric2<T, K> {
	public T sample;
	public K sapmle2;
}

class Parent {
}

class Child extends Parent {
}

class Data<T extends Parent> {
}