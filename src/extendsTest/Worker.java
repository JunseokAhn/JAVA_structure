package extendsTest;

public class Worker extends Man implements speakable {

	public Worker(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		String name = super.getName();
		return name + "일꾼은 자기가 맡은 일을 잘하고 싶어한다";
	}

}
