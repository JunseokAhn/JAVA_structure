package extendsTest;

public class Reader extends Man implements speakable {

	public Reader(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		String name = super.getName();
		return name + "독자는 자바를 잘하고 싶다";
	}

}
